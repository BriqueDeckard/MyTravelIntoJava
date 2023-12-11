package creational.gof.factory.example.domain.impl;

import creational.gof.factory.example.domain.contracts.MotorVehicle;

public class MotorCycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Build motorcycle");
	}
}
