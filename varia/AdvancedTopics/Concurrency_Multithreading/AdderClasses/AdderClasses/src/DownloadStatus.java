import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    // Multiple places in mamory
    private LongAdder totalBytes = new LongAdder();

    public int getTotalBytes() {
        // convert to int
        return totalBytes.intValue();
    }

    public void incrementTotalBytes() {
        // increment in three steps (threads are competing)
        // Adder
        totalBytes.increment();;
    }
}