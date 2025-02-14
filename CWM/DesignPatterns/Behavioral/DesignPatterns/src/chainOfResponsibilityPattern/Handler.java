package chainOfResponsibilityPattern;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    // Determines if the handler is done handling the request
    // Initiates the next handler
    // Checks if it is the last handler
    public void handle(HttpRequest request) {
        if (doHandle(request))
            return;

        if (next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);

}
