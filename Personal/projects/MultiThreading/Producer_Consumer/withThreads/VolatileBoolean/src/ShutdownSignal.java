public class ShutdownSignal {
    private volatile boolean shutdown = false;

    public void shutdown() {
        this.shutdown = true;
    }

    public boolean isShutdown() {
        return shutdown;
    }
}
