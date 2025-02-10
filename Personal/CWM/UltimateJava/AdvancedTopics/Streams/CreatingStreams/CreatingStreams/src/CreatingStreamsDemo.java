import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        // streams from arraylists
        var list = new ArrayList<>(
            Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );
        var listStream = list.stream();
        listStream.forEach(System.out::println);
        
        // streams from arrays
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var arrayStream = Arrays.stream(array);
        arrayStream.forEach(System.out::println);

        // streams from number of objects
        var objectStream = Stream.of(1, 2, 3, 4);
        objectStream.forEach(System.out::println);

        // infinite streams (with limit of 10)
        Stream<Double> infStream = Stream.generate(() -> Math.random());
        infStream.limit(10).forEach(System.out::println);

        // Second method for infinite streams
        Stream.iterate(1, n -> n + 10)
                    .limit(10)
                    .forEach(System.out::println);
    }
}
