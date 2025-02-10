import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final ShutdownSignal shutdownSignal;

    public Consumer(BlockingQueue<Integer> queue, ShutdownSignal shutdownSignal) {
        this.queue = queue;
        this.shutdownSignal = shutdownSignal;
    }

    // Executes the Consumer thread logic.
    @Override
    public void run() {
        try {
            while (!shutdownSignal.isShutdown()) {
                Integer number = queue.poll();
                if (number != null) {
                    System.out.println(Thread.currentThread().getName() + " Consumer removed: " + number);
                    Thread.sleep(1000);
                } else {
                    Thread.sleep(100);
                }
            }
            System.out.println(Thread.currentThread().getName() + " is shutting down.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
