public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    // constructor
    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    // run method
    @Override
    public void run() {
        System.out.println("Downloading file " + Thread.currentThread().getName());

        // simulate download
        for (int i = 0; i < 1_000_000; i++) {
            // update status
            status.incrementTotalBytes();
        }

        // signal that download is done
        status.done();

        // notify thread that status is changed
        synchronized (status) {
            status.notifyAll();
        }
    }
}
