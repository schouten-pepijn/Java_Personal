import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class WatingForMany {
    public static void show () {
        var first = CompletableFuture.supplyAsync(() -> 1);
        var second = CompletableFuture.supplyAsync(() -> 2);
        var third = CompletableFuture.supplyAsync(() -> 3);

        // wait for all to complete (returns void)
        CompletableFuture.allOf(first, second, third)
            .thenRun(() -> {
                try {
                    System.out.println(first.get());
                    System.out.println(second.get());
                    System.out.println(third.get());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            });
        
    }
}
