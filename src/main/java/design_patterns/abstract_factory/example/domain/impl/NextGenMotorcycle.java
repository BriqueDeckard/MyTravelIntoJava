package design_patterns.abstract_factory.example.domain.impl;

import design_patterns.factory.example.domain.contracts.MotorVehicle;

public class NextGenMotorcycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("NextGen Motorcycle");
	}
}
