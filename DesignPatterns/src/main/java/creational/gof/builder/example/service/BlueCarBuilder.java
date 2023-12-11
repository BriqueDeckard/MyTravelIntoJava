package creational.gof.builder.example.service;


import creational.gof.builder.example.domain.Car;

public class BlueCarBuilder implements CarBuilderContract {
	public Car build() {
		Car car = new Car();
		car.setColor("BLUE");
		return car;
	}
}
