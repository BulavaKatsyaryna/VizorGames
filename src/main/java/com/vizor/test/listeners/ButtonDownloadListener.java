package com.vizor.test.listeners;

import com.vizor.test.workingWithImages.ImageFileFilter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDownloadListener extends Component implements ActionListener {

    JFileChooser jFileChooser = new JFileChooser();
//    JButton save = new JButton("Save");

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        jFileChooser.setDialogTitle("Choose an image");
        jFileChooser.addChoosableFileFilter(new ImageFileFilter());
        jFileChooser.setAcceptAllFileFilterUsed(false);

        jFileChooser.setFileSelectionMode(
                JFileChooser.DIRECTORIES_ONLY);
        int res = jFileChooser.showOpenDialog(ButtonDownloadListener.this);
        if (res == JFileChooser.APPROVE_OPTION)
            JOptionPane.showMessageDialog(ButtonDownloadListener.this,
                    jFileChooser.getSelectedFile());





    }
}



//        save.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                jFileChooser.setDialogTitle("Saving a file");
//                jFileChooser.setFileSelectionMode(
//                        JFileChooser.FILES_ONLY);
//                int res = jFileChooser.showSaveDialog(ButtonDownloadListener.this);
//                if (res == JFileChooser.APPROVE_OPTION)
//                    JOptionPane.showMessageDialog(ButtonDownloadListener.this, "File saved");
//            }
//        });