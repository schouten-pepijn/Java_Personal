package chainOfResponsibilityPattern;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }
    
        @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = request.getUsername().equals("admin") && 
                      request.getPassword().equals("password");

        System.out.println("Authentication");

        // If the request is not valid, the next handler will be called
        return !isValid;
    }
}
