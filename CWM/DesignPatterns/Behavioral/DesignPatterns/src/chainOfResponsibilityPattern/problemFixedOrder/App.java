package chainOfResponsibilityPattern.problemFixedOrder;

public class App {
    public static void main(String[] args) {
        WebServer webServer = new WebServer(
            new Authenticator(),
            new Logger(),
            new Compressor()
        );

        webServer.handle(
            new HttpRequest("admin", "password")
        );
    }
}
