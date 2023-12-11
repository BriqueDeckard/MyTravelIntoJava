package creational.gof.factory.example.services.impl;

import creational.gof.factory.example.domain.contracts.MotorVehicle;
import creational.gof.factory.example.domain.impl.MotorCycle;
import creational.gof.factory.example.services.contracts.MotorVehicleFactory;

public class MotorCycleFactory extends MotorVehicleFactory {
	@Override
	protected MotorVehicle createMotorVehicle() {
		return new MotorCycle();
	}
}
