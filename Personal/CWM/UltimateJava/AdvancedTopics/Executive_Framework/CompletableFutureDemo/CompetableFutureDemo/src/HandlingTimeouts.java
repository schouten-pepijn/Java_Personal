import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class HandlingTimeouts {
    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 1;
        });

        try {
            future
                // .orTimeout(1,TimeUnit.SECONDS)  // Throws TimeoutException
                .completeOnTimeout(1, 1, TimeUnit.SECONDS)  // returns default value
                .get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        
    }
}
