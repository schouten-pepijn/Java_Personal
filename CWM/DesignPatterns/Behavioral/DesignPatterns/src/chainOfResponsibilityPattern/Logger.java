package chainOfResponsibilityPattern;

public class Logger extends Handler {

    public Logger(Handler next) {
            super(next);
        }
    
        public boolean doHandle(HttpRequest request) {
        System.out.println("Log");

        // If the request is not valid, the next handler will be called
        return false;
    }
}
