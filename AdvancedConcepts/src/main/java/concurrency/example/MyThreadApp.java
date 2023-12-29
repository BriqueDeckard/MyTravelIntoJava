package concurrency.example;

import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class MyThreadApp {

    public static void main(String[] args) {
        Lock verrou1 =
                new ReentrantLock(); // Le verrou permet de synchroniser les coureurs et d'éviter les problèmes de concurrence
        Lock verrou2 =
                new ReentrantLock();

        Set<Thread> threads = Set.of(
                new MyRunner("Coureur 1", verrou1),
                new MyRunner("Coureur 2", verrou1),
                new MyRunner("Coureur 3", verrou1),
                new MyRunner("Coureur 4", verrou1),
                new MyRunner("Coureur 5", verrou1),
                new MyRunner("Coureur 6", verrou2),
                new MyRunner("Coureur 7", verrou2),
                new MyRunner("Coureur 8", verrou2),
                new MyRunner("Coureur 9", verrou2),
                new MyRunner("Coureur 10", verrou2)
        ).stream().map(runner -> new Thread(runner)).collect(Collectors.toSet());

        threads.forEach(thread -> thread.start());
    }
}
