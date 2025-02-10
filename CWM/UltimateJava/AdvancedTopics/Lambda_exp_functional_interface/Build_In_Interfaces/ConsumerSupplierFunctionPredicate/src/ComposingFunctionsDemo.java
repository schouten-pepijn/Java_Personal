import java.util.function.Function;

public class ComposingFunctionsDemo {
    // input: "key:value"
    // first: "key=value"
    // second: "{key=value}"
    public static void show() {
        // First
        Function<String, String> replaceColon = str -> str.replace(":", "=");

        // Second
        Function<String, String> addBraces = str -> "{" + str + "}";

        // Composing #1 (forward order)
        var result1 = replaceColon
                        .andThen(addBraces)
                            .apply("key:value");

        // Usage #1
        System.out.println(result1);

        // Composing #2 (reverse order)
        var result2 = addBraces
                        .compose(replaceColon)
                            .apply("key:value");

        // Usage #2
        System.out.println(result2);


    }





}
