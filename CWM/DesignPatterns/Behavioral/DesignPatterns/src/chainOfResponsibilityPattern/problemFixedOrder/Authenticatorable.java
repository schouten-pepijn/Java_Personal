package chainOfResponsibilityPattern.problemFixedOrder;

public interface Authenticatorable {
    boolean authenticate(HttpRequest request);
}
