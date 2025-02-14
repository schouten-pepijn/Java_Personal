package chainOfResponsibilityPattern.problemFixedOrder;

public class Compressor implements Compressorable {
    public void compress(HttpRequest request) {
        System.out.println("Compress");
    }
}
