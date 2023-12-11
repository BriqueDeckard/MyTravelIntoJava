package creational.gof.abstract_factory.example.services.impl;

import creational.gof.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.gof.abstract_factory.example.domain.impl.FutureVehicleElectricCar;
import creational.gof.abstract_factory.example.domain.impl.FutureVehicleMotorcycle;
import creational.gof.abstract_factory.example.services.contracts.AbstractFactory;
import creational.gof.factory.example.domain.contracts.MotorVehicle;

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
