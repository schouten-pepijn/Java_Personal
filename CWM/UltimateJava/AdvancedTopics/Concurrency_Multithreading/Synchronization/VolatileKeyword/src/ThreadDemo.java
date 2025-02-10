public class ThreadDemo {
    public static void show () {
        var status = new DownloadStatus();


        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {
            // Blocking call to wait for the download to complete
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        // let the thread wait untill it is awaken
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Download complete " + status.getTotalBytes());
        });
        
        thread1.start();
        thread2.start();

    }
}
