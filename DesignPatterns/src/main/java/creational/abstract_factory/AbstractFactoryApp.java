package creational.abstract_factory;


import creational.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.abstract_factory.example.services.contracts.AbstractFactory;
import creational.abstract_factory.example.services.impl.FutureVehicleCorporation;
import creational.abstract_factory.example.services.impl.NextGenVehicleCorporation;
import creational.factory.example.domain.contracts.MotorVehicle;

public class AbstractFactoryApp {
	public static void main(String[] args) {
		AbstractFactory futureVehicle = new FutureVehicleCorporation();
		final ElectricVehicle electricVehicle = futureVehicle.createElectricVehicle();
		final MotorVehicle motorVehicle = futureVehicle.createMotorVehicle();
		AbstractFactory nextGen = new NextGenVehicleCorporation();
		final ElectricVehicle electricVehicle1 = nextGen.createElectricVehicle();
		final MotorVehicle motorVehicle1 = nextGen.createMotorVehicle();

	}
}
