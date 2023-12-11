package creational.gof.abstract_factory.example.domain.impl;


import creational.gof.factory.example.domain.contracts.MotorVehicle;

public class NextGenMotorcycle implements MotorVehicle {
	@Override
	public void build() {
		System.out.println("NextGen Motorcycle");
	}
}
