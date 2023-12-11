package creational.gof.abstract_factory.example.services.impl;

import creational.gof.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.gof.abstract_factory.example.domain.impl.NextGenMotorcycle;
import creational.gof.abstract_factory.example.domain.impl.NextGenElectricCar;
import creational.gof.abstract_factory.example.services.contracts.AbstractFactory;
import creational.gof.factory.example.domain.contracts.MotorVehicle;


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
