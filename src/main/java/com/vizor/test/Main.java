package com.vizor.test;

import javax.swing.*;
import java.awt.Dimension;

public class Main {
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;

    public void run() {
        JFrame frame = new JFrame("DT Developer Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        Components components = new Components();
        SpringLayout layout = new SpringLayout();
        frame.setLayout(layout);

        frame.add(components.jTextField);
        frame.add(components.buttonSearch);
        frame.add(components.buttonDownload);
        frame.add(components.buttonNext);
        frame.add(components.panelGallery);

        //        Разбиение на ячейки (для картинок)
        //        frame.setLayout(new GridLayout(5, 5));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main()::run);
    }
}
