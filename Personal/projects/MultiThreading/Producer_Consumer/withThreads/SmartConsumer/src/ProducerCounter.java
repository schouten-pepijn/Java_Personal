import java.util.concurrent.atomic.AtomicInteger;

public class ProducerCounter {
    private final AtomicInteger activeProducers;

    public ProducerCounter(int initialCount) {
        this.activeProducers = new AtomicInteger(initialCount);
    }

    public void decrement() {
        activeProducers.decrementAndGet();
    }

    public int getCount() {
        return activeProducers.get();
    }

}
