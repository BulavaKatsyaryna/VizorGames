package com.vizor.test.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDownloadListener extends Component implements ActionListener {

    JFileChooser jFileChooser = new JFileChooser();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jFileChooser.setDialogTitle("Choose a catalog");
        jFileChooser.setFileSelectionMode(
                JFileChooser.DIRECTORIES_ONLY);
        int res = jFileChooser.showOpenDialog(ButtonDownloadListener.this);
        if (res == JFileChooser.APPROVE_OPTION)
            JOptionPane.showMessageDialog(
                    ButtonDownloadListener.this,
                    jFileChooser.getSelectedFile());
    }
}
