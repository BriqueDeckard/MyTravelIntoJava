package gang_of_four.creational.abstract_factory.example.services.impl;

import gang_of_four.creational.abstract_factory.example.domain.contract.ElectricVehicle;
import gang_of_four.creational.abstract_factory.example.domain.impl.NextGenElectricCar;
import gang_of_four.creational.abstract_factory.example.domain.impl.NextGenMotorcycle;
import gang_of_four.creational.abstract_factory.example.services.contracts.AbstractFactory;
import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;


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
