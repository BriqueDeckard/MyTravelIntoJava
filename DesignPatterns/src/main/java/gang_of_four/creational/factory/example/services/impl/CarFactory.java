package creational.factory.example.services.impl;

import creational.factory.example.domain.contracts.MotorVehicle;
import creational.factory.example.domain.impl.Car;
import creational.factory.example.services.contracts.MotorVehicleFactory;

public class CarFactory extends MotorVehicleFactory {
	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Car();
	}
}
