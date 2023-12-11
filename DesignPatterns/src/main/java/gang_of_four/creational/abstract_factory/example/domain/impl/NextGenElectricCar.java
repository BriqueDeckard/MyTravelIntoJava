package gang_of_four.creational.abstract_factory.example.domain.impl;

import gang_of_four.creational.abstract_factory.example.domain.contract.ElectricVehicle;

public class NextGenElectricCar implements ElectricVehicle {
	@Override
	public void build() {
		System.out.println("NextGen Electric Car");
	}
}
