package creational.abstract_factory.example.services.impl;

import creational.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.abstract_factory.example.domain.impl.NextGenElectricCar;
import creational.abstract_factory.example.domain.impl.NextGenMotorcycle;
import creational.abstract_factory.example.services.contracts.AbstractFactory;
import creational.factory.example.domain.contracts.MotorVehicle;


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
