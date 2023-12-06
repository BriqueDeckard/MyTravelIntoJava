package associated_frameworks.dependency_injection.dagger;

import javax.inject.Inject;

public class Car {
	private Engine engine;
	private Brand brand;

	@Inject
	public Car(Engine engine, Brand brand) {
		this.engine = engine;
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Car{" +
				"engine=" + engine +
				", brand=" + brand +
				'}';
	}
}
