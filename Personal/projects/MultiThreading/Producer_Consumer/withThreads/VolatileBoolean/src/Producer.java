import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int maxItems;
    private final ShutdownSignal shutdownSignal;

    public Producer(BlockingQueue<Integer> queue, int maxItems, ShutdownSignal shutdownSignal) {
        this.queue = queue;
        this.maxItems = maxItems;
        this.shutdownSignal = shutdownSignal;
    }

    // Executes the Producer thread logic.
    @Override
    public void run() {
        try {
            for (int i = 0; i < maxItems; i++) {
                int number = ThreadLocalRandom
                        .current()
                        .nextInt(1, 100);

                System.out.println(Thread.currentThread().getName() + " Producer added: " + number);

                queue.put(number); // Place items in the queue, wait if full

                Thread.sleep(500); // Simulate long task
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}