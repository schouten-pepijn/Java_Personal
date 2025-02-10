import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void show() {
        var movies = List.of(
            new Movie("The Matrix", 100),
            new Movie("The Matrix Reloaded", 80),
            new Movie("The Matrix Revolutions", 70)
        );

    // map function
    movies.stream()
        // .map(movie -> movie.getTitle())
        .map(Movie::getTitle)  // applies the function to each element
        .forEach(System.out::println);

    movies.stream()
        .mapToInt(Movie::getLikes) 
        .forEach(System.out::println);
    
    
    // flatmap function Stream<List<Integer>> -> Stream<Integer>
    Stream<List<Integer>> stream = Stream.of(
                    List.of(1, 2, 3),
                    List.of(4, 5, 6)
    );
    // stream.forEach(System.out::println);
    stream
        // .flatMap(list -> list.stream())
        .flatMap(List::stream)
        .forEach(System.out::println);


    }
}

