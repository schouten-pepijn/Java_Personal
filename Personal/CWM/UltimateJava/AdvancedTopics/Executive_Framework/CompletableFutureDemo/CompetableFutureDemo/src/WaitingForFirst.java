import java.util.concurrent.CompletableFuture;

public class WaitingForFirst {
    public static void show() {
        // show method
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });
        
        // fast method
        var second = CompletableFuture.supplyAsync(() -> 20);

        // wait for first to complete
        CompletableFuture.anyOf(first, second)
            .thenAccept(System.out::println);
    }

}
