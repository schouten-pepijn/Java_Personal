import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show () {
        var status = new DownloadStatus();

        // list of threads
        List<Thread> threads = new ArrayList<>();
        
        // download 10 files
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);
        }

        // wait for all threads to finish
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Total bytes downloaded: " + status.getTotalBytes());

    }
}
