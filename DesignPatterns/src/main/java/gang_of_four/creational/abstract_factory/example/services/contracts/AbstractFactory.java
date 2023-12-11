package gang_of_four.creational.abstract_factory.example.services.contracts;


import gang_of_four.creational.abstract_factory.example.domain.contract.ElectricVehicle;
import gang_of_four.creational.factory.example.domain.contracts.MotorVehicle;

public abstract class AbstractFactory {
	public abstract MotorVehicle createMotorVehicle();

	public abstract ElectricVehicle createElectricVehicle();

}
