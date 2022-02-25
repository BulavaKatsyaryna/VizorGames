package com.vizor.test.listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSaveListener extends Component implements ActionListener {

//    JFileChooser jFileChooser = new JFileChooser();
    ButtonDownloadListener buttonDownloadListener = new ButtonDownloadListener();

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        buttonDownloadListener.jFileChooser.setDialogTitle("Saving a file");
        buttonDownloadListener.jFileChooser.setFileSelectionMode(
                JFileChooser.FILES_ONLY);
        int res = buttonDownloadListener.jFileChooser.showSaveDialog(ButtonSaveListener.this);
        if (res == JFileChooser.APPROVE_OPTION)
            JOptionPane.showMessageDialog(ButtonSaveListener.this, "File saved");
        }
    }