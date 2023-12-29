package concurrency.example;

import java.util.concurrent.locks.Lock;

public class MyRunner implements Runnable {
    String nom;
    Lock verrou;

    public MyRunner(String nom, Lock verrou) {
        this.nom = nom;
        this.verrou = verrou;
    }

    @Override
    public void run() {
        // Quand on lock on bloque l'accès à la ressource
        verrou.lock();
        try {
            System.out.println("I " + this.nom + " am running.");
            Thread.sleep(1000);
            System.out.println("I " + this.nom + " have finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            verrou.unlock();
        }

    }
}
