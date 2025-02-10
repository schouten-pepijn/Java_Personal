import java.util.function.Supplier;

public class SupplierDemo {
    public static void show() {
        // Supplier interface () zero input
        Supplier<Double> getRandom = () -> Math.random();

        var random = getRandom.get();
        System.out.println(random);
    }
}
