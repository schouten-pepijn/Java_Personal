import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
            new Movie("The Shawshank Redemption", 10),
            new Movie("The Godfather", 15),
            new Movie("The Dark Knight", 20)
        );
    
        // non-stream method of counting number of likes (imperative)
        int count1 = 0;
        for (var movie : movies) {
            if (movie.getLikes() > 10)
                count1++;
        }
        System.out.println(count1);

        // Functional style of counting number of likes (declarative)
        var count2 = movies.stream()
                        .filter(movie -> movie.getLikes() > 10)
                        .count();
        System.out.println(count2);
    }
}
