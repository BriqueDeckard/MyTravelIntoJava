package design_patterns.abstract_factory.example.services.contracts;

import design_patterns.abstract_factory.example.domain.contract.ElectricVehicle;
import design_patterns.factory.example.domain.contracts.MotorVehicle;

public abstract class AbstractFactory {
	public abstract MotorVehicle createMotorVehicle();

	public abstract ElectricVehicle createElectricVehicle();

}
