package chainOfResponsibilityPattern;

public class App {
    public static void main(String[] args) {
        //Build processing pipeline
        // Authenticator -> Logger -> Compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);

        // Call the server
        var server = new WebServer(authenticator);
        server.handle(new HttpRequest("admin", "password"));
    }
}
