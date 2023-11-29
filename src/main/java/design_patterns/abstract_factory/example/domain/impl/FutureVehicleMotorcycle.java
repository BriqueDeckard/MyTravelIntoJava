package design_patterns.abstract_factory.example.domain.impl;

import design_patterns.factory.example.domain.contracts.MotorVehicle;

public class FutureVehicleMotorcycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Future vehicle motorcycle");
	}
}
