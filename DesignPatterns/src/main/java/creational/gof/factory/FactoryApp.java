package creational.gof.factory;


import creational.gof.factory.example.domain.contracts.MotorVehicle;
import creational.gof.factory.example.services.impl.CarFactory;
import creational.gof.factory.example.services.impl.MotorCycleFactory;
import creational.gof.factory.my_imp.domain.contracts.MyEntityContract1;
import creational.gof.factory.my_imp.services.impl.MyConcreteEntity1Factory;
import creational.gof.factory.my_imp.services.impl.MyConcreteEntity2Factory;

public class FactoryApp {

	public static void main(String[] args) {
		example();
		myImp();
	}

	private static void myImp() {
		MyEntityContract1 concreteEntity1 = new MyConcreteEntity1Factory().build("concrete 1");
		concreteEntity1.doSomething();
		MyEntityContract1 concreteEntity2 = new MyConcreteEntity2Factory().build("Concrete 2");
		concreteEntity2.doSomething();
	}

	private static void example() {
		MotorVehicle car = new CarFactory().create();
		MotorVehicle motorCycle = new MotorCycleFactory().create();
	}
}
