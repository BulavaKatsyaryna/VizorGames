package com.vizor.test.gallery;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ListImages extends JList {

    File[] files;

    public ListImages() {
        setLayout(new GridLayout(6, 4, 5, 5));
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

        int count2 = count1 + 24;
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

    public void searchFiles() {

    }
}

