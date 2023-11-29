package design_patterns.factory.example.domain.impl;

import design_patterns.factory.example.domain.contracts.MotorVehicle;

public class MotorCycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Build motorcycle");
	}
}
