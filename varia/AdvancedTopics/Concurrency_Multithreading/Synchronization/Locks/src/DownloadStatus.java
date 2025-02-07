import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    // create a lock object
    private ReentrantLock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        // increment in three steps (threads are competing)

        // lock the object
        lock.lock();
        
        // to prevent deadlock
        try {
            totalBytes++;
        } finally {
        // unlock the object
        lock.unlock();
        }
    }
}