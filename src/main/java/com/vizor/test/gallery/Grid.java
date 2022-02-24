package com.vizor.test.gallery;

import javax.swing.*;
import java.awt.*;

public class Grid {

    public static void main(String[] args) {
        new Grid();
    }

    public Grid() {
        EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        });
    }
}
