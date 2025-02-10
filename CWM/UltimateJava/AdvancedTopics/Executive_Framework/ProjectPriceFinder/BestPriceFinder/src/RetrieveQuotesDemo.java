import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class RetrieveQuotesDemo {
    public static void show() {
        // start time
        var startTime = LocalTime.now();

        // get quotes
        var service = new FlightService();
        var futures = service
            .getQuotesAsync()
            .map(future -> future.thenAccept(System.out::println))
            .collect(Collectors.toList());

        // wait for all futures to complete
        CompletableFuture
            .allOf(futures.toArray(new CompletableFuture[0]))
            .thenRun(() -> {
                // calculate duration
                var endTime = LocalTime.now();
                var duration = Duration.between(startTime, endTime);
                System.out.println("Completed in " + duration.toMillis() + " ms");
            });

        // simulate a long running task
        LongTask.simulateLongTask();


    }
}
