import java.util.concurrent.CompletableFuture;

public class RunningOnCompletion {
    public static void show() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 1);

        // Run a task when the future completes
        // future.thenRun(() -> System.out.println("Done"));

        // Run a task when the future completes asynchronously
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });

        // Returns a task when the future completes
        future.thenAccept(result -> System.out.println(result));
    }
}
