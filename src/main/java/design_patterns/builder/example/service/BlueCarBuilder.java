package design_patterns.builder.example.service;

import design_patterns.builder.example.domain.Car;

public class BlueCarBuilder implements CarBuilderContract {
	public Car build() {
		Car car = new Car();
		car.setColor("BLUE");
		return car;
	}
}
