package concurrency.experiment;

public class Engine {
    private Brand brand;

    public Engine(Brand brand) {
        this.brand = brand;
    }

    public Engine() {
    }

    public Engine(Builder builder) {
        this.brand = builder.brand;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public static class Builder {
        private Brand brand;

        public Builder withBrand(Brand brand) {
            if (brand == null) {
                throw new IllegalArgumentException();
            }
            this.brand = brand;
            return this;
        }

        public Engine build() {
            return new Engine(this);
        }
    }


    @Override
    public String toString() {
        return "Engine{" +
                "engine=" + brand +
                '}';
    }
}
