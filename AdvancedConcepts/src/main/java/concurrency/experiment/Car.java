package concurrency.experiment;

import java.util.concurrent.locks.Lock;

public class Car {
    private Engine engine;

    public Car() {
    }


    public Car(Builder builder) {
        this.engine = builder.engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public static class Builder implements Runnable {

        private Lock lock;
        private Engine engine;

        public Builder withEngine(Engine engine) {
            if (engine == null) {
                throw new IllegalArgumentException();
            }
            this.engine = engine;
            return this;
        }

        public Builder withLock(Lock lock) {
            if (lock == null) {
                return this;
            }
            this.lock = lock;
            return this;
        }

        public Car build() {
            if (lock != null) {
                lock.lock();
            }

            Car car = new Car(this);
            System.out.println(car);

            if (lock != null) {
                lock.unlock();
            }
            return car;
        }

        @Override
        public void run() {
            build();
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
