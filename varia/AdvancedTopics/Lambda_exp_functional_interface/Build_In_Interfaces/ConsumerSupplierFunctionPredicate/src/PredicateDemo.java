import java.util.function.Predicate;

public class PredicateDemo {
    public static void show() {
        // Predicate interface (boolean output)
        Predicate<String> isLongerThan5 = str -> str.length() > 5;

        var result = isLongerThan5.test("Sky");
        System.out.println(result);
    }
}
