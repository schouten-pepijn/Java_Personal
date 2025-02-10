import java.util.List;
import java.util.stream.Collectors;

public class CollectingDemo {
    public static void show() {
        var movies = List.of(
            new Movie("The Matrix", 100),
            new Movie("The Matrix Revolutions", 70),
            new Movie("The Matrix Reloaded", 80)
        );

        // Collect stream to a hash map
        var result = movies
            .stream()
            .filter(m -> m.getLikes() > 70)
            .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        System.out.println(result);




    }


}
