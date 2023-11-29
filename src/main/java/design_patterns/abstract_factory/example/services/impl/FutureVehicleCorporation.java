package design_patterns.abstract_factory.example.services.impl;

import design_patterns.abstract_factory.example.domain.contract.ElectricVehicle;
import design_patterns.abstract_factory.example.domain.impl.FutureVehicleElectricCar;
import design_patterns.abstract_factory.example.domain.impl.FutureVehicleMotorcycle;
import design_patterns.abstract_factory.example.services.contracts.AbstractFactory;
import design_patterns.factory.example.domain.contracts.MotorVehicle;

public class FutureVehicleCorporation extends AbstractFactory {
	@Override
	public MotorVehicle createMotorVehicle() {
		return new FutureVehicleMotorcycle();
	}

	@Override
	public ElectricVehicle createElectricVehicle() {
		return new FutureVehicleElectricCar();
	}
}
