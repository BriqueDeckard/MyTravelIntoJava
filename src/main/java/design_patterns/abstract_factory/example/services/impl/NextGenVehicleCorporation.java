package design_patterns.abstract_factory.example.services.impl;

import design_patterns.abstract_factory.example.domain.contract.ElectricVehicle;
import design_patterns.abstract_factory.example.domain.impl.NextGenElectricCar;
import design_patterns.abstract_factory.example.domain.impl.NextGenMotorcycle;
import design_patterns.abstract_factory.example.services.contracts.AbstractFactory;
import design_patterns.factory.example.domain.contracts.MotorVehicle;

public class NextGenVehicleCorporation extends AbstractFactory {
	@Override
	public MotorVehicle createMotorVehicle() {
		return new NextGenMotorcycle();
	}

	@Override
	public ElectricVehicle createElectricVehicle() {
		return new NextGenElectricCar();
	}
}
