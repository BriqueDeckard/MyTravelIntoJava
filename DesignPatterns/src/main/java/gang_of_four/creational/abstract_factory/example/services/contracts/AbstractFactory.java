package creational.abstract_factory.example.services.contracts;


import creational.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.factory.example.domain.contracts.MotorVehicle;

public abstract class AbstractFactory {
	public abstract MotorVehicle createMotorVehicle();

	public abstract ElectricVehicle createElectricVehicle();

}
