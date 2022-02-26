package com.vizor.test.workingWithImages;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class ImageFileFilter extends FileFilter {

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        String name = file.getName().toLowerCase();
        return (name.endsWith(".jpg") || name.endsWith(".png"));
    }

    @Override
    public String getDescription() {
        return "Images (*.jpg, *.png )";
    }
}
