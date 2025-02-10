import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final int poisonPill;

    public Consumer(BlockingQueue<Integer> queue, int poisonPill) {
        this.queue = queue;
        this.poisonPill = poisonPill;
    }

    // Executes the Consumer thread logic.
    @Override
    public void run() {
        try {
            while (true) {
                int number = queue.take();
                if (number == poisonPill) {
                    System.out.println(Thread.currentThread().getName() + " Consumer received poison pill");
                    queue.put(poisonPill);
                    break;
                }
                System.out.println(Thread.currentThread().getName() + " Consumer removed: " + number);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
