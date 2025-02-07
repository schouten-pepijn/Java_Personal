import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        // create resizable arraybased double ended queue (ArrayDeque)
        Queue<String> queue = new ArrayDeque<>();

        // add items (aggressive)
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b->a->c
        System.out.println(queue);

        //offer items (non-aggressive)
        queue.offer("d");
        // d->b->a->c

        // get item at the front (Null if empty)
        var front = queue.peek();
        System.out.println(front);

        // get item at the from (exception if empty)
        var item = queue.element();
        System.out.println(item);
    }
}
