import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class FlightService {
    // random number generator
    private Random random = new Random();

    public Stream<CompletableFuture<Quote>> getQuotesAsync() {
        // list of sites
        var sites  = List
            .of("site1", "site2", "site3");

        // return a stream of quotes
        return sites.stream().map(this::getQuoteAsync);
    }

    // return a quote from a site
    public Quote getQuote(String site) {
        // print a message
        System.out.println("Getting a quote for " + site);

        // return new quote object
        return new Quote(site, randomPrice());
    }

    // return a quote from a site asynchronously
    public CompletableFuture<Quote> getQuoteAsync(String site) {
        return CompletableFuture.supplyAsync(() -> {

            // print a message
            System.out.println("Getting a quote for " + site);

            // simulate a long running task
            LongTask.simulateLongTask(randomDelay());
            
            // return new quote object
            return new Quote(site, randomPrice());
        });
    }

    // return a random price
    private int randomPrice() {
        return 100 + random.nextInt(10);
    }

    // return a random delay
    private int randomDelay() {
        return 1_000 + random.nextInt(2_000);
    }
     
    
}
