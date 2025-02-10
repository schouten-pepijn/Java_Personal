import java.util.List;
import java.util.Optional;

public class ReducingDemo {
    public static void show() {
        var movies = List.of(
            new Movie("The Matrix", 100),
            new Movie("The Matrix Revolutions", 70),
            new Movie("The Matrix Reloaded", 80)
        );

        // Summation of all the like values
        Optional<Integer> sum = movies
            .stream()
            .map(m -> m.getLikes())
            .reduce((a, b) -> a + b);

        // summation with Integer class
        Integer sum2 = movies
            .stream()
            .map(Movie::getLikes)
            .reduce(0, Integer::sum);

        System.out.println(sum.orElse(null));
        System.out.println(sum2);


    }

}
