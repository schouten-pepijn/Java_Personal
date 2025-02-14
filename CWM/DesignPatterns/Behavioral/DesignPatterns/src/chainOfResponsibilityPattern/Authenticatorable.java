package chainOfResponsibilityPattern;

public interface Authenticatorable {
    boolean authenticate(HttpRequest request);
}
