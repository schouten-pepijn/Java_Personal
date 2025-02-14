package chainOfResponsibilityPattern.problemCoupling;

public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        var isValid = request.getUsername().equals("admin") && 
                      request.getPassword().equals("password");

        System.out.println("Authentication");

        return isValid;
    }
}
