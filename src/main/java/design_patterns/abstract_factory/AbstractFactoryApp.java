package design_patterns.abstract_factory;

import design_patterns.abstract_factory.example.domain.contract.ElectricVehicle;
import design_patterns.abstract_factory.example.services.contracts.AbstractFactory;
import design_patterns.abstract_factory.example.services.impl.FutureVehicleCorporation;
import design_patterns.abstract_factory.example.services.impl.NextGenVehicleCorporation;
import design_patterns.factory.example.domain.contracts.MotorVehicle;

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
