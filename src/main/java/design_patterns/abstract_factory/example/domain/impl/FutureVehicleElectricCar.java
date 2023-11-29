package design_patterns.abstract_factory.example.domain.impl;

import design_patterns.abstract_factory.example.domain.contract.ElectricVehicle;

public class FutureVehicleElectricCar implements ElectricVehicle {
	@Override
	public void build() {
		System.out.println("Future Vehicle Electric Car");
	}
}
