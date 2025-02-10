import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);

        // imperative programming (how)
        for (var item : list)
            System.out.println(item);

        // declarative programming (what)
        list.forEach(item -> System.out.println(item));


        // chaining consumers
        List<String> listStr = List.of("a", "b", "c");
        // Consumer<String> print = item -> System.out.println(item);
        Consumer<String> print = System.out::println;
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        // chained consumers
        listStr.forEach(print.andThen(printUpperCase).andThen(print));

    }
}
