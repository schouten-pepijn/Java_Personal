public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    // constructor
    public DownloadFileTask() {
        // create Download Status object
        this.status = new DownloadStatus();
    }

    // run method
    @Override
    public void run() {
        System.out.println("Downloading file " + Thread.currentThread().getName());

        // simulate download
        for (int i = 0; i < 10_000; i++) {
            // update status
            status.incrementTotalBytes();
        }
    }

    // getters
    public DownloadStatus getStatus() {
        return status;
    }

}
