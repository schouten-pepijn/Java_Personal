package StrategyPattern;

public class JpegCompressor implements Compressorable {

    @Override
    public void compress(String filename) {
        System.out.println("Compressing JPEG");
    }

}
