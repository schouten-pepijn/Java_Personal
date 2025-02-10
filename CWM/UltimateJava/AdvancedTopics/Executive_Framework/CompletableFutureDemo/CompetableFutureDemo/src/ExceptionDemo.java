import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionDemo {
    public static void show() {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting info");
            // does not throw an exception on main thread
            throw new RuntimeException();
        });

        try {
            // This will throw the exception
            future.get();

            // This will catch the exception and map it to a new function
            // creates new CompletableFuture object of same type
            var info = future.exceptionally(ex -> null).get();
            System.out.println(info);


        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
