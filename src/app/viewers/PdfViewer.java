package app.viewers;

import app.adapters.ImageAdapter;

public class PdfViewer implements ImageViewer {
    ImageAdapter imageAdapter;

    @Override
    public void view(String imageType, String fileName) {

        if (imageType.equalsIgnoreCase("pdf")) {
            System.out.println("Viewing pdf file: " + fileName);
        }

        else if (imageType.equalsIgnoreCase("png") ||
                imageType.equalsIgnoreCase("jpg")
        ) {
            imageAdapter = new ImageAdapter(imageType);
            imageAdapter.view(imageType, fileName);
        } else {
            System.out.println("Invalid media. " + imageType + " format not supported");
        }
    }
}
