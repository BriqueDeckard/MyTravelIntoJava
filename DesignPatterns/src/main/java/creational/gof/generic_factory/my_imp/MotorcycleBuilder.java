package creational.gof.generic_factory.my_imp;

public class MotorcycleBuilder implements MotorVehicleBuilder<Motorcycle> {
	@Override
	public Motorcycle build() {
		return new Motorcycle();
	}
}
