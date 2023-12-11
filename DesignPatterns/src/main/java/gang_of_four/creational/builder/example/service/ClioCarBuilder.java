package gang_of_four.creational.builder.example.service;


import gang_of_four.creational.builder.example.domain.Car;

public class ClioCarBuilder implements CarBuilderContract {
	@Override
	public Car build() {
		Car clioCar = new Car();
		clioCar.setBrand("CLIO");
		return clioCar;
	}
}
