package app.adapters;

import app.viewers.AdvancedImageViewer;
import app.viewers.ImageViewer;
import app.viewers.JpgViewer;
import app.viewers.PngViewer;

public class ImageAdapter implements ImageViewer {
    AdvancedImageViewer advancedImageViewer;

    public ImageAdapter(String imageType) {

        if (imageType.equalsIgnoreCase("png")) {
            advancedImageViewer = new PngViewer();
        } else if (imageType.equalsIgnoreCase("jpg")) {
            advancedImageViewer = new JpgViewer();
        }
    }

    @Override
    public void view(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("png")) {
            advancedImageViewer.viewPng(fileName);
        } else if (imageType.equalsIgnoreCase("jpg")) {
            advancedImageViewer.viewJpg(fileName);
        }
    }
}
