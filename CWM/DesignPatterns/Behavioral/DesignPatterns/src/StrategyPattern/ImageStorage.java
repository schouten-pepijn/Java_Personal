package strategyPattern;

public class ImageStorage {
    private Compressorable compressor;
    private Filterable filter;

    public ImageStorage(Compressorable compressor, Filterable filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
