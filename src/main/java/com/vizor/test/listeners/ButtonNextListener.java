package com.vizor.test.listeners;

import com.vizor.test.gallery.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNextListener implements ActionListener {

    Panel panel = new Panel();

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Uploading the following images...");
        panel.addingFiles();
    }
}
