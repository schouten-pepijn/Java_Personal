public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        // increment in three steps (threads are competing)
        // non atomic
        totalBytes++;
    }
}