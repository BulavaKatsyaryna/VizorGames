package com.vizor.test.gallery;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Panel extends JPanel {

    public Panel(String center) {
        setLayout(new GridLayout(5, 3, 1, 1));
        File[] files = new File("assets")
                .listFiles(pathname -> {
                    String name = pathname.getName().toLowerCase();
                    return pathname.isFile() &&
                            name.endsWith(".png");
                });

        setBackground(Color.LIGHT_GRAY);

        assert files != null;
        Arrays.sort(files);
        int count = 0;
        while (count < 15 && count < files.length) {
            try {
                System.out.println(count + "; " + files[count]);
                add(new JLabel(new ImageIcon(ImageIO.read(files[count]))));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            count++;
        }
    }
}
