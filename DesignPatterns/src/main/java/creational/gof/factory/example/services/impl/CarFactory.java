package creational.gof.factory.example.services.impl;

import creational.gof.factory.example.domain.contracts.MotorVehicle;
import creational.gof.factory.example.domain.impl.Car;
import creational.gof.factory.example.services.contracts.MotorVehicleFactory;

public class CarFactory extends MotorVehicleFactory {
	@Override
	protected MotorVehicle createMotorVehicle() {
		return new Car();
	}
}
