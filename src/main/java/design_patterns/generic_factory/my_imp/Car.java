package design_patterns.generic_factory.my_imp;

public class Car implements MotorVehicle {
	@Override
	public void run() {
		System.out.println("Car");
	}
}
