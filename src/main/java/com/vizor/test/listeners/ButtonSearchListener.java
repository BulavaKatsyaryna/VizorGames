package com.vizor.test.listeners;

import com.vizor.test.Components;
import com.vizor.test.gallery.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSearchListener implements ActionListener {

    Components components = new Components();
    Panel panel = new Panel();

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Name search in progress...");
        String searchText = components.jTextField.getText();
        System.out.println("Search by name: " + searchText);

        panel.searchFiles();
    }
}
