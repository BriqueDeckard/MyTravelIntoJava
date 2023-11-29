package design_patterns.abstract_factory.example.domain.impl;

import design_patterns.abstract_factory.example.domain.contract.ElectricVehicle;

public class NextGenElectricCar implements ElectricVehicle {
	@Override
	public void build() {
		System.out.println("NextGen Electric Car");
	}
}
