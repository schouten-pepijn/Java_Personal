import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
    public static void show() {
        // UnaryOperator interface (one in -> one out)
        UnaryOperator<Integer> square = a -> a * a;
        UnaryOperator<Integer> increment = a -> a + 1;

        var result = increment
                        .andThen(square)
                        .apply(1);
        
        System.out.println(result);
    }
}
