package com.vizor.test;

import com.vizor.test.gallery.Panel;
import com.vizor.test.listeners.ButtonNextListener;
import com.vizor.test.listeners.ButtonSearchListener;

import javax.swing.*;
import java.awt.*;

public class Main {
    private static final int WIDTH = 1024;
    private static final int HEIGHT = 768;

    Components components = new Components();
    BorderLayout layout = new BorderLayout();

    public void run() {
        JFrame frame = new JFrame("DT Developer Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(layout);
        frame.pack();

        frame.add(components.buttonBar, BorderLayout.NORTH);
        components.buttonBar.setBackground(Color.GRAY);
        components.buttonBar.add(components.jTextField);
        components.buttonBar.add(components.buttonSearch);
        components.buttonBar.add(components.buttonDownload);

        frame.add(components.buttonNext, BorderLayout.SOUTH);

        frame.add(new Panel());

        components.buttonNext.addActionListener(new ButtonNextListener());
        components.buttonSearch.addActionListener(new ButtonSearchListener());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Main()::run);
    }
}