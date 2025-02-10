import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class CompletableFutureDemo {
    public static void show() {
        // ForkJoinPool.commonPool() <- standard pool

        // No return value
        Runnable task = () -> System.out.println("a");
        var future = CompletableFuture.runAsync(task);

        // With return value
        Supplier<Integer> task2 = () -> 1;
        var future2 = CompletableFuture.supplyAsync(task2);
        
    }
}