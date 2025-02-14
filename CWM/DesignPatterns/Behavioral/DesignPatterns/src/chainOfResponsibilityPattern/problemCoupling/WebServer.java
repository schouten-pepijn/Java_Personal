package chainOfResponsibilityPattern.problemCoupling;

public class WebServer {
    // (!) TIGHT COUPLING (!)
    public void handle(HttpRequest request) {
        //Authentication
        var authenticator = new Authenticator();
        authenticator.authenticate(request);

        // Logging
        var logger = new Logger();
        logger.log(request);

        // Compression
        var compressor = new Compressor();
        compressor.compress(request);

    }
}
