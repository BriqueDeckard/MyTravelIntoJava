package design_patterns.generic_factory.my_imp;

public class Motorcycle implements MotorVehicle {
	@Override
	public void run() {
		System.out.println("Motorcycle");
	}
}
