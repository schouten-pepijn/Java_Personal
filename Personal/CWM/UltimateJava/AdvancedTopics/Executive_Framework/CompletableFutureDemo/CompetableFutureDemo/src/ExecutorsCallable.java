import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ExecutorsCallable {
    public static void show() {
        // Create a fixed thread pool
        var executor = Executors.newFixedThreadPool(2);
        
        try {
            // Submit a callable task
            var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });

            System.out.println("Do more work");

            // Get the result
            // blocking method
            var result = future.get();
            System.out.println(result);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();

        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }
}