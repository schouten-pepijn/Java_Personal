import java.util.function.Function;

public class FunctionDemo {
    public static void show() {
        // Function interface (input, output)
        Function<String, Integer> map = str -> str.length();

        var len = map.apply("Sky");
        System.out.println(len);
    }
}
