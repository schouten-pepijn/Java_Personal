import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        // create collection
        Collection<String> collection = new ArrayList<>();

        // add items with utility class collections
        Collections.addAll(collection, "a", "b", "c");

        // iterate over the items
        for (var item : collection) {
            System.out.println(item);
        }

        // some methods of collection object
        System.out.println(collection.size());
        System.out.println(collection.contains("a"));

        // to string array (with [0] convention)
        String[] stringArray = collection.toArray(new String[0]);
        for (var item : stringArray) {
            System.out.println(item);
        }

        // Create new array
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        // different collections in memory
        System.out.println(collection == other);

        // check equal contents
        System.out.println(collection.equals(other));
    }
}
