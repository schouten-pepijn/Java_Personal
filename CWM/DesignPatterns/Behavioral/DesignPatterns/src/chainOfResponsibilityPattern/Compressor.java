package chainOfResponsibilityPattern;

public class Compressor extends Handler {

    public Compressor(Handler next) {
            super(next);
        }
    
        @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compress");

        // If the request is not valid, the next handler will be called
        return false;
    }
}
