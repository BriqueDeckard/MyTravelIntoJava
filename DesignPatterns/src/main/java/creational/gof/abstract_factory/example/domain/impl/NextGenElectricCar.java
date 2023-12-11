package creational.gof.abstract_factory.example.domain.impl;

import creational.gof.abstract_factory.example.domain.contract.ElectricVehicle;

public class NextGenElectricCar implements ElectricVehicle {
	@Override
	public void build() {
		System.out.println("NextGen Electric Car");
	}
}
