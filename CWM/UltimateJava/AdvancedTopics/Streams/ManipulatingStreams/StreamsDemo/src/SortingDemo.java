import java.util.Comparator;
import java.util.List;

public class SortingDemo {
    public static void show() {
        var movies = List.of(
            new Movie("The Matrix", 100),
            new Movie("The Matrix Revolutions", 70),
            new Movie("The Matrix Reloaded", 80)
        );

        // Create a stream
        movies
            .stream()
            // .sorted()  rely on the movie class comparator interface
            // .sorted(Comparator) // pass a comparator
            .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
            .sorted(Comparator.comparing(Movie::getTitle))  // identical to line above
            .forEach(m -> System.out.println(m.getTitle()));

    }
}
