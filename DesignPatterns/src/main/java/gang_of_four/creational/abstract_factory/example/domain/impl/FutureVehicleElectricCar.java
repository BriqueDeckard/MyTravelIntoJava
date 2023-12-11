package gang_of_four.creational.abstract_factory.example.domain.impl;

import gang_of_four.creational.abstract_factory.example.domain.contract.ElectricVehicle;

public class FutureVehicleElectricCar implements ElectricVehicle {
	@Override
	public void build() {
		System.out.println("Future Vehicle Electric Car");
	}
}
