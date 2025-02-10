import java.util.concurrent.CompletableFuture;

public class ComposingDemo {
    // async method for getting user email
    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    } 

    // async method for getting playlist
    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }
    
    // async method for getting playlist
    public static void show() {
        // id -> email
        // email -> playlist
        getUserEmailAsync()
            .thenCompose(ComposingDemo::getPlaylistAsync)
            .thenAccept(System.out::println);
    }
}
