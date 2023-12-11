package creational.gof.builder.my_imp.domain;

public class MyComplexEntity {

    private String name;
    private String key;
    private String brand;
    private int code;

    public MyComplexEntity() {
    }

    public MyComplexEntity(String name, String key, String brand, int code) {
        this.name = name;
        this.key = key;
        this.brand = brand;
        this.code = code;
    }

    public MyComplexEntity(Builder builder) {
        this.name = builder.name;
        this.key = builder.key;
        this.brand = builder.brand;
        this.code = builder.code;
    }

    @Override
    public String toString() {
        return "MyComplexEntity{" +
                "name='" + name + '\'' +
                ", key='" + key + '\'' +
                ", brand='" + brand + '\'' +
                ", code=" + code +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class Builder {
        private String name;
        private String key;
        private String brand;
        private int code;

        public Builder withName(String name) {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Name must not be null.");
            }
            this.name = name;
            return this;
        }

        public Builder withKey(String key) {
            this.key = key;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withCode(int code) {
            this.code = code;
            return this;
        }

        public MyComplexEntity build() {
            return new MyComplexEntity(this);
        }
    }

}
