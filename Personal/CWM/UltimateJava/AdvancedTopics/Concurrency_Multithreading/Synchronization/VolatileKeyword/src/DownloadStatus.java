public class DownloadStatus {
    private int totalBytes;

    // are files downloaded?
    // volatile keyword ensures that the value is never cached
    private volatile boolean isDone;
    

    // create monitor object
    private Object totalBytesLock = new Object();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        // increment in three steps (threads are competing)

        // using the synchronized block (lose concurrency)
        synchronized (totalBytesLock) {
            totalBytes++;
        }
    }

    // getters setters
    public boolean isDone() {
        return isDone;
    }

    public void done() {
        this.isDone = true;
    }
}