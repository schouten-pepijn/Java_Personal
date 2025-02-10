import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ThreadDemo {
    public static void show () {
        // Import a synchronized collection
        Collection<Integer> collection = 
            Collections.synchronizedCollection(new ArrayList<>());

        // create two threads to add to the collection
        var thread1 = new Thread(() -> {
            collection.addAll(Arrays.asList(1, 2, 3));
        });
        var thread2 = new Thread(() -> {
            collection.addAll(Arrays.asList(4, 5, 6));
        });

        // start the threads
        thread1.start();
        thread2.start();

        // join the threads
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // print the collection
        System.out.println(collection);
    }
}
