public class ThreadInterrupt {
    public static void show(){
        Thread thread = new Thread(new DownloadFileTaskInterrupt());
        thread.start();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // interrupt the thread (no forced stop)
        thread.interrupt();




    }
}
