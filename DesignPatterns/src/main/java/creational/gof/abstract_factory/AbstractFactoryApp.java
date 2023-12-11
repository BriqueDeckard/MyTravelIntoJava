package creational.gof.abstract_factory;


import creational.gof.abstract_factory.example.domain.contract.ElectricVehicle;
import creational.gof.abstract_factory.example.services.contracts.AbstractFactory;
import creational.gof.abstract_factory.example.services.impl.FutureVehicleCorporation;
import creational.gof.abstract_factory.example.services.impl.NextGenVehicleCorporation;
import creational.gof.factory.example.domain.contracts.MotorVehicle;

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
