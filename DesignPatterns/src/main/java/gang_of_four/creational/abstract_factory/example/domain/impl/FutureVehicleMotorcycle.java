package gang_of_four.creational.abstract_factory.example.domain.impl;

import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;

public class FutureVehicleMotorcycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Future vehicle motorcycle");
	}
}
