package gang_of_four.creational.builder.example.service;


import gang_of_four.creational.builder.example.domain.Car;

public class BlueCarBuilder implements CarBuilderContract {
	public Car build() {
		Car car = new Car();
		car.setColor("BLUE");
		return car;
	}
}
