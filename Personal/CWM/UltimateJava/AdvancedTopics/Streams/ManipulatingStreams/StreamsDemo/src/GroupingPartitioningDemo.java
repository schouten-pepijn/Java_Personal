import java.util.List;
import java.util.stream.Collectors;

public class GroupingPartitioningDemo {
    public static void show() {
        var movies = List.of(
            new MovieGenre("The Matrix", 100, Genre.ACTION),
            new MovieGenre("The Matrix Reloaded", 80, Genre.COMEDY),
            new MovieGenre("The Matrix Revolutions", 70, Genre.ACTION)
        );


        // group the elements with groupingBy and map the titles wit , delimiter
        var result = movies
            .stream()
            .collect(Collectors.groupingBy(
                MovieGenre::getGenre,  // Function
                Collectors.mapping(  // Collector
                    MovieGenre::getTitle,
                    Collectors.joining(", ")
                )
            )
        );

        // partition the elements with partitionBy by a predicate statement
        var result2 = movies
            .stream()
            .collect(Collectors.partitioningBy(  // partitioning
                m -> m.getLikes() > 70,  // predicate
                Collectors.mapping(
                    MovieGenre::getTitle,
                    Collectors.joining(", ")
                )
            )
        );


        System.out.println(result);
        System.out.println(result2);
    }
}
