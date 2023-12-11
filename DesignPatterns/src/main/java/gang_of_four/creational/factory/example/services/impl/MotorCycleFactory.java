package gang_of_four.creational.factory.example.services.impl;

import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;
import gang_of_four.creational.factory.example.domain.impl.MotorCycle;
import gang_of_four.creational.factory.example.services.contracts.MotorVehicleFactory;

public class MotorCycleFactory extends MotorVehicleFactory {
	@Override
	protected MotorVehicle createMotorVehicle() {
		return new MotorCycle();
	}
}
