package com.vizor.test;

import javax.swing.*;
import java.awt.*;

public class Components {

    JTextField jTextField = new JTextField(20);

    JButton buttonSearch = new JButton("Search");
    JButton buttonDownload = new JButton("Download images");
    JButton buttonNext = new JButton("Next page");

    JPanel panelGallery = new JPanel(new FlowLayout(FlowLayout.CENTER));

    public Components() {
        panelGallery.setBackground(Color.LIGHT_GRAY);

    }
}
