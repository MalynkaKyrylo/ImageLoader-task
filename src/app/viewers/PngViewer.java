package app.viewers;

public class PngViewer implements AdvancedImageViewer {
    @Override
    public void viewJpg(String fileName) {
        System.out.println("Viewing png file: " + fileName);
    }

    @Override
    public void viewPng(String fileName) {
    }
}
