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
        layout.putConstraint(SpringLayout.NORTH, components.jTextField, 0,
                SpringLayout.NORTH, frame);

        frame.add(components.buttonSearch);
        layout.putConstraint(SpringLayout.NORTH, components.buttonSearch, 25,
                SpringLayout.NORTH, components.jTextField);

        frame.add(components.buttonDownload);
        layout.putConstraint(SpringLayout.WEST, components.buttonDownload, 860,
                SpringLayout.WEST, components.jTextField);

        frame.add(components.buttonNext);
        layout.putConstraint(SpringLayout.SOUTH, components.buttonNext, 670,
                SpringLayout.SOUTH, components.buttonSearch);

        frame.add(new Panel());

        //        Разбиение на ячейки (для картинок)
        //        frame.setLayout(new GridLayout(5, 5));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main()::run);
    }
}
