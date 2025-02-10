import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorDemo {
    public static void show() {
        // BinaryOperator interface (two in -> one out)
        BinaryOperator<Integer> add = (a, b) -> a + b;

        var result1 = add.apply(1, 2);
        System.out.println(result1);

        // chaining binary operators
        Function<Integer, Integer> square = a -> a * a;

        var result2 = add
                        .andThen(square)
                        .apply(1, 2);
        System.out.println(result2);
    }
}
