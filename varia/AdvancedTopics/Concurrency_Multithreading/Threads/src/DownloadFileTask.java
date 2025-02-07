public class DownloadFileTask implements Runnable {

    // implements Runnable
    @Override
    public void run() {
        // get the name of the thread
        var threadName = Thread.currentThread().getName();

        System.out.println("Downloading a file " + threadName);


        try {
            // Puts the thread to sleep
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download complete");
    }

}
