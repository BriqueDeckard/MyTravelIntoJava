package gang_of_four.creational.factory.example.domain.impl;

import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;

public class Car implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("Build car.");
	}
}
