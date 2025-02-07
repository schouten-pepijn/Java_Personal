import java.util.List;

public class SlicingDemo {
    public static void show() {
        var movies = List.of(
            new Movie("The Matrix", 100),
            new Movie("The Matrix Reloaded", 80),
            new Movie("The Matrix Revolutions", 70)
        );

    // Create streams
    movies
        .stream()
        .limit(2)  // get first two items in stream
        .forEach(m -> System.out.println(m.getTitle()));

    movies
        .stream()
        .skip(1)  // skip first item in stream
        .forEach(m -> System.out.println(m.getTitle()));

    movies 
        .stream()
        .takeWhile(m -> m.getLikes() > 80) // stops the stream when condition is false
        .forEach(m -> System.out.println(m.getTitle()));
    }

}
