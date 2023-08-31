package app.viewers;

public class JpgViewer implements AdvancedImageViewer{
    @Override
    public void viewJpg(String fileName) {
    }

    @Override
    public void viewPng(String fileName) {
        System.out.println("Viewing jpg file: " + fileName);
    }
}
