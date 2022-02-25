package com.vizor.test.listeners;

import com.vizor.test.workingWithImages.ListImages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonNextListener implements ActionListener {

    ListImages listImages = new ListImages();

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Uploading the following images...");
        listImages.addingFiles();
    }
}
