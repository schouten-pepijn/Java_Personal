import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    // atomic integer class
    private AtomicInteger totalBytes = new AtomicInteger();

    public int getTotalBytes() {
        // get total bytes
        return totalBytes.get();
    }

    public void incrementTotalBytes() {
        // increment in three steps (threads are competing)
        // atomic integer
        totalBytes.incrementAndGet();  // swaps values in cpu
    }
}