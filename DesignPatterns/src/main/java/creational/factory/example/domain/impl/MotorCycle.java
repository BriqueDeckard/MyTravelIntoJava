package creational.factory.example.domain.impl;

import creational.factory.example.domain.contracts.MotorVehicle;

public class MotorCycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Build motorcycle");
	}
}
