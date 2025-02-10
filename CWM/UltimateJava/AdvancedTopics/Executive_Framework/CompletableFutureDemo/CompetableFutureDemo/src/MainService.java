import java.util.concurrent.CompletableFuture;

public class MainService {
    // Blocking method (synchronous)
    public void send() {
        LongTask.simulate();

        System.out.println("Mail Send");
    }

    // Asynchronous implementation
    public CompletableFuture<Void> sendAsync() {
        return CompletableFuture.runAsync(() -> send());
    }
}
