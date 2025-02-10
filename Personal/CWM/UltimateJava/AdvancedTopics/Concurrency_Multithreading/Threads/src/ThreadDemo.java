public class ThreadDemo {
    public static void show() {
        // get the name of the current thread
        System.out.println(Thread.currentThread().getName());

        // Simulate 10 downloads
        for (int i = 0; i < 10; i++) {
          
            Thread thread = new Thread(new DownloadFileTask());  // must implement Runnable
         
            // start the thread
            thread.start();
        }
    }
}
