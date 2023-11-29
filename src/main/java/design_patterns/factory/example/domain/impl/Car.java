package design_patterns.factory.example.domain.impl;

import design_patterns.factory.example.domain.contracts.MotorVehicle;

public class Car implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Build car.");
	}
}
