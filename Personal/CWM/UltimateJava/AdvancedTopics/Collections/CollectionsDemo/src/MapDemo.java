import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        // HashTables are scalable and efficient (size does not matter)
        // HashTables are not ordered
        // HashTables are not iterable
        // HashTables are not synchronized
        // HashTables are not thread-safe
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        var unknown = new Customer("Unknown", "null");

        // Create hashmap
        Map<String, Customer> map = new HashMap<>();
        // insest customers
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // get a customer on key
        var customer = map.get("e1");
        System.out.println(customer);

        // get or default a customer on key
        var customer2 = map.getOrDefault("e10", unknown);
        System.out.println(customer2);

        // replace
        var replace = map.replace("e1", new Customer("a++", "b"));
        System.out.println(replace);

        // list of keys
        for (var key : map.keySet())
            System.out.println(key);

        // list of entries
        for (var entry : map.entrySet()) {
            System.out.println(
                String.format("key=%s value=%s", entry.getKey(), entry.getValue())
            );
        }
    }
}
