package concurrency;

public class MyThreadApp {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
        Thread mySecondThread = new Thread(myRunnable);
        mySecondThread.start();

        for (int i = 0; i < 100; i++) {
            int finalI = i;
            Runnable runnable1 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("runnable : " + finalI);
                }
            };
            Thread thread1 = new Thread(runnable1);
            thread1.start();
        }

    }
}
