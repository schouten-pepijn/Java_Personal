import java.util.List;

public class UniqueDemo {
    public static void show() {
        var movies = List.of(
            new Movie("The Matrix", 100),
            new Movie("The Matrix", 100),
            new Movie("The Matrix Reloaded", 80)
        );


        movies
            .stream()
            .map(Movie::getLikes)
            .distinct()  // gets unique values
            .forEach(System.out::println);
    }
}
