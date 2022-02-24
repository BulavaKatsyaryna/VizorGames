package com.vizor.test.gallery;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Panel extends JPanel {

    File[] files;

    public Panel() {
        setLayout(new GridLayout(10, 2, 1, 1));
        files = new File("assets")
                .listFiles(pathname -> {
                    String name = pathname.getName().toLowerCase();
                    return pathname.isFile() &&
                            name.endsWith(".png");
                });

        addingFiles();

        setBackground(Color.LIGHT_GRAY);
    }

    int count1 = 0;

    public void addingFiles() {

        int count2 = count1 + 20;
        if (files != null) {
            while (count1 < count2 && count1 < files.length) {
                try {
                    System.out.println(count1 + "; " + files[count1]);
                    add(new JLabel(new ImageIcon(ImageIO.read(files[count1]))));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                count1++;
            }
        }
    }
}

