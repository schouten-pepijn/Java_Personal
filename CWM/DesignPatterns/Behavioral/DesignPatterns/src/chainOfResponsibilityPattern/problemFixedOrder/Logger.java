package chainOfResponsibilityPattern.problemFixedOrder;

public class Logger implements Loggerable {
    public void log(HttpRequest request) {
        System.out.println("Log");
    }
}
