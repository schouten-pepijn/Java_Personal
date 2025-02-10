import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public static void show () {
        // Regular not thread safe hashmap
        // Map<Integer,String> map = new HashMap<>();

        // Thread safe HashMap (Thread safe Interface)
        Map<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.get(1);

    }
}
