package strategyPattern.problem;

public class ImageStorage {
    private String compressor;
    private String filter;

    
    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    // Violates Single Responsibility Principle
    // Not maintainable
    // Violates Open/Closed Principle
    public void store(String fileName) {
        if (compressor == "jpeg") {
            System.out.println("Compressing JPEG");
        } else if (compressor == "png") {
            System.out.println("Compressing PNG");
        }

        if (filter == "b&w") {
            System.out.println("Applying b&w Filter");
        } else if (filter == "high-contrast") {
            System.out.println("Applying high-contrast Filter");
        }
    }
}
