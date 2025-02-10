public class Utils {
    // Generic method that expects a type that implements Comparable
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? first : second;
    }

    // method with generic parameters (also works for classes)
    public static <K, V> void print(K key, V value) {
        System.out.printf("%s=%s%n", key, value);
    }
}
