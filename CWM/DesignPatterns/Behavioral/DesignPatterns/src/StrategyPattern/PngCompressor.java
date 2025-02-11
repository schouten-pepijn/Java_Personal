package StrategyPattern;

public class PngCompressor implements Compressorable {

    @Override
    public void compress(String filename) {
        System.out.println("Compressing PNG");
    }
}
