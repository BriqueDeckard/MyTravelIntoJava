package design_patterns.builder.example.service;

import design_patterns.builder.example.domain.Car;

public class ClioCarBuilder implements CarBuilderContract {
	@Override
	public Car build() {
		Car clioCar = new Car();
		clioCar.setBrand("CLIO");
		return clioCar;
	}
}
