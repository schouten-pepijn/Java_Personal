public class DownloadFileTaskInterrupt implements Runnable {

    // implements Runnable
    @Override
    public void run() {
        // get the name of the thread
        var threadName = Thread.currentThread().getName();

        System.out.println("Downloading a file " + threadName);


        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            // check if the thread is interrupted
            if (Thread.currentThread().isInterrupted()) 
                return;
            
            System.out.println("Downloading file " + i);
        }

        System.out.println("Download complete");
        
    }

}