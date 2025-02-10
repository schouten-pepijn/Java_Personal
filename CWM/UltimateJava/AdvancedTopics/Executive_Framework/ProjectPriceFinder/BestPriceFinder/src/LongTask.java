public class LongTask {

    // simulate a long running task
    public static void simulateLongTask() {
        try {
            Thread.sleep(6_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // simulate a long running task with a delay
    public static void simulateLongTask(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
