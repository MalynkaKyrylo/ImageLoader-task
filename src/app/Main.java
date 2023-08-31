package app;

import app.viewers.PdfViewer;

public class Main {
    public static void main(String[] args) {
        PdfViewer pdfViewer = new PdfViewer();

        pdfViewer.view("pdf", "Data structure and Algorithms in JAVA.pdf");
        pdfViewer.view("png", "Patterns in Java.png");
        pdfViewer.view("jpg", "Collections types in JAVA.jpg");
        pdfViewer.view("cdr", "Diagram.cdr");
    }
}
