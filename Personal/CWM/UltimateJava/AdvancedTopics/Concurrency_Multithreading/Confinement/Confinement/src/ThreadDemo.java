import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show () {
        // list of threads
        List<Thread> threads = new ArrayList<>();

        // download status list (for confinement)
        List<DownloadFileTask> tasks = new ArrayList<>();
        
        // download 10 files
        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
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

        // combine the bytes for the tasks with stream api
        var totalBytes = tasks.stream()
            .map(t -> t.getStatus().getTotalBytes())
            .reduce(0, Integer::sum);


        System.out.println("Total bytes downloaded: " + totalBytes);

    }
}
