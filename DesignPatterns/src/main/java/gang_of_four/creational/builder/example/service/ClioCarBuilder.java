package creational.builder.example.service;


import creational.builder.example.domain.Car;

public class ClioCarBuilder implements CarBuilderContract {
	@Override
	public Car build() {
		Car clioCar = new Car();
		clioCar.setBrand("CLIO");
		return clioCar;
	}
}
