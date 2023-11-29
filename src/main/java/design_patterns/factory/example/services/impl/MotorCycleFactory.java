package design_patterns.factory.example.services.impl;

import design_patterns.factory.example.domain.contracts.MotorVehicle;
import design_patterns.factory.example.domain.impl.MotorCycle;
import design_patterns.factory.example.services.contracts.MotorVehicleFactory;

public class MotorCycleFactory extends MotorVehicleFactory {
	@Override
	protected MotorVehicle createMotorVehicle() {
		return new MotorCycle();
	}
}
