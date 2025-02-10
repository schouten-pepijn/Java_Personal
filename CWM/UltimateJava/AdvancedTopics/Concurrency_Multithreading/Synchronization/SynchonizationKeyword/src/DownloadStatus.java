public class DownloadStatus {
    private int totalBytes;
    
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
}