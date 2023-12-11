package creational.gof.abstract_factory.example.domain.impl;

import creational.gof.factory.example.domain.contracts.MotorVehicle;

public class FutureVehicleMotorcycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Future vehicle motorcycle");
	}
}
