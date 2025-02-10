import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
        int numberProducers = 10;
        int numberConsumers = 2;
        int itemsPerProducer = 10;

        ProducerCounter producerCounter = new ProducerCounter(numberProducers);
        Thread[] producers = new Thread[numberProducers];
        Thread[] consumers = new Thread[numberConsumers];

        // start producers
        for (int i = 0; i < numberProducers; i++) {
            producers[i] = new Thread(new Producer(queue, itemsPerProducer, producerCounter), "Producer-" + i);
            producers[i].start();
        }

        // start consumers
        for (int i = 0; i < numberConsumers; i++) {
            consumers[i] = new Thread(new Consumer(queue, producerCounter), "Consumer-" + i);
            consumers[i].start();
        }

        // wait for all threads to finish
        for (Thread producer : producers) {
            try {
                producer.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // wait for all threads to finish
        for (Thread consumer : consumers) {
            try {
                consumer.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("All threads finished");
    }
}