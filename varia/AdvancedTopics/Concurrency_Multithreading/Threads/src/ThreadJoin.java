public class ThreadJoin {
    public static void show(){
        Thread thread = new Thread(new DownloadFileTask());

        // start the thread
        thread.start();

        // wait for the thread to complete
        try {
            thread.join();  // current thread waits for the thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("File ready to be scanned!");
    }
}
