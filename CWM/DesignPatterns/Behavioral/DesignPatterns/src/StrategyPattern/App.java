package StrategyPattern;

public class App {
    public static void main(String[] args) {

        var imageStorage = new ImageStorage(
            new JpegCompressor(),
            new HighContrastFilter()
        );

        imageStorage.store("image1.jpg");
        imageStorage.store("image2.jpg");
    }
}
