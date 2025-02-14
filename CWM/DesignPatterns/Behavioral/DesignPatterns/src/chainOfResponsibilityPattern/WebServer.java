package chainOfResponsibilityPattern;

public class WebServer {
    private final Authenticatorable authenticator;
    private final Loggerable logger;
    private final Compressorable compressor;
    
    public WebServer(Authenticatorable authenticator, Loggerable logger, Compressorable compressor) {
        this.authenticator = authenticator;
        this.logger = logger;
        this.compressor = compressor;
    }

    // Webserver is decoupled from its dependencies
    // However the order of the execution is fixed
    public void handle(HttpRequest request) {
        //Authentication
        authenticator.authenticate(request);

        // Logging
        logger.log(request);

        // Compression
        compressor.compress(request);

    }
}
