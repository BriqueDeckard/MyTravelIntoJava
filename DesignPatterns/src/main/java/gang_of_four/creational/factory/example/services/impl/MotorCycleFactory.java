package creational.factory.example.services.impl;

import creational.factory.example.domain.contracts.MotorVehicle;
import creational.factory.example.domain.impl.MotorCycle;
import creational.factory.example.services.contracts.MotorVehicleFactory;

public class MotorCycleFactory extends MotorVehicleFactory {
	@Override
	protected MotorVehicle createMotorVehicle() {
		return new MotorCycle();
	}
}
