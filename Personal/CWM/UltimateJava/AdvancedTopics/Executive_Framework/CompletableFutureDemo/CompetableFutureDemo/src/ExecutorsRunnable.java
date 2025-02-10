import java.util.concurrent.Executors;

public class ExecutorsRunnable {
    public static void show() {
        // Create a fixed thread pool
        var executor = Executors.newFixedThreadPool(2);
        
        try {
            // Submit a runnable task
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }
}
