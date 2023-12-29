package concurrency.explanation;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Runnable execution");
    }
}
