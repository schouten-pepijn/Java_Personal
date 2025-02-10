import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;
    private final ProducerCounter producerCounter;

    public Consumer(BlockingQueue<Integer> queue, ProducerCounter producerCounter) {
        this.queue = queue;
        this.producerCounter = producerCounter;
    }

    // Executes the Consumer thread logic.
    @Override
    public void run() {
        try {
            while (true) {
                Integer number = queue.poll();
                if (number != null) {
                    System.out.println(Thread.currentThread().getName() + " Consumer removed: " + number);
                    Thread.sleep(1000);
                } else {
                    if (producerCounter.getCount() == 0) {
                        System.out.println(Thread.currentThread().getName() + " found no producers. Stopping ...");
                        break;
                    }
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
