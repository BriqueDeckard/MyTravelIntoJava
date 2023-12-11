package creational.gof.factory.example.domain.impl;

import creational.gof.factory.example.domain.contracts.MotorVehicle;

public class Car implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Build car.");
	}
}
