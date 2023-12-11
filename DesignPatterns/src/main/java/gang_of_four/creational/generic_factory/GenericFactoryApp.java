package creational.generic_factory;


import creational.generic_factory.my_imp.Car;
import creational.generic_factory.my_imp.Motorcycle;
import creational.generic_factory.my_imp.MotorizedVehicleFactory;

public class GenericFactoryApp {
	public static void main(String[] args) {
		MotorizedVehicleFactory motorizedVehicleFactory = new MotorizedVehicleFactory();
		final Car car1 = motorizedVehicleFactory.getMotorVehicleBuilder(Car.class).build();
		car1.run();
		final Motorcycle motorCycle1 = motorizedVehicleFactory.getMotorVehicleBuilder(Motorcycle.class).build();
		motorCycle1.run();
	}
}
