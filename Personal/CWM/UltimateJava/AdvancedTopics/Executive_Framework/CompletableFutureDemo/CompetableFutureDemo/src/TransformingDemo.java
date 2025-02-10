import java.util.concurrent.CompletableFuture;

public class TransformingDemo {
    public static int toFahrenheit(int celsius) {
        return (int) (celsius *1.8) + 32;
    }

    public static void show() {
        var future = CompletableFuture.supplyAsync(() -> 20);

        future
            .thenApply(TransformingDemo::toFahrenheit)  // transform future
            .thenAccept(f -> System.out.println(f));  // consume future
    }
}
