package com.vizor.test.listeners;

import com.vizor.test.Components;
import com.vizor.test.ListImages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSearchListener implements ActionListener {

    Components components = new Components();
    ListImages listImages = new ListImages();
    public String searchText = "";

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Name search in progress...");
        String searchText = components.jTextField.getText();
        System.out.println("Search by name: " + searchText);
        listImages.searchFiles();
    }
}
