import java.util.concurrent.CompletableFuture;

public class CombiningDemo {
    public static void show() {
        // 20 USD
        // exchange rate (0.9)
        // wait to complete
        // calculate result

        var first = CompletableFuture
           .supplyAsync(() -> "20USD")
            .thenApply(str -> {
                var price = str.replace("USD", "");
                return Integer.parseInt(price);
        });

        var second = CompletableFuture.supplyAsync(() -> 0.9);

        first
            // wait for both to complete
            .thenCombine(second, (price, rate) -> price * rate)
            .thenAccept(System.out::println);
    }
}
