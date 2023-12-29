package concurrency.experiment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyExperimentApp {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Car.Builder builder = new Car.Builder().withLock(lock);
        Engine engine = new Engine.Builder().withBrand(Brand.CETRION).build();
        builder.withEngine(engine);
        for (int i = 0; i < 10; i++) {
            builder.run();
        }


    }
}
