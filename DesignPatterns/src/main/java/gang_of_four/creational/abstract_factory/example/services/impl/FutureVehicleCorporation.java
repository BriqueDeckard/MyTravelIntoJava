package gang_of_four.creational.abstract_factory.example.services.impl;

import gang_of_four.creational.abstract_factory.example.domain.contract.ElectricVehicle;
import gang_of_four.creational.abstract_factory.example.domain.impl.FutureVehicleElectricCar;
import gang_of_four.creational.abstract_factory.example.domain.impl.FutureVehicleMotorcycle;
import gang_of_four.creational.abstract_factory.example.services.contracts.AbstractFactory;
import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;

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
