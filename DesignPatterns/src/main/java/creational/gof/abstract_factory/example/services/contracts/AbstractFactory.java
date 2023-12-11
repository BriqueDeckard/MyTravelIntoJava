package creational.gof.abstract_factory.example.services.contracts;


import creational.gof.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.gof.factory.example.domain.contracts.MotorVehicle;

public abstract class AbstractFactory {
	public abstract MotorVehicle createMotorVehicle();

	public abstract ElectricVehicle createElectricVehicle();

}
