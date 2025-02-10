import java.util.List;
import java.util.function.Predicate;

public class FilterDemo {
    public static void show() {
        var movies = List.of(
            new Movie("Matrix", 100),
            new Movie("The Matrix Reloaded", 80),
            new Movie("The Matrix Revolutions", 70)
        );
    
        
        // Create a custom Predicate
        Predicate<Movie> beginsWithThe = m -> m.getTitle().startsWith("The");
        // Create a stream with a filter
        movies
            .stream()
            .filter(m -> m.getLikes() > 75)
            .filter(beginsWithThe)
            .map(m -> m.getTitle())
            .forEach(System.out::println);
    }
}
