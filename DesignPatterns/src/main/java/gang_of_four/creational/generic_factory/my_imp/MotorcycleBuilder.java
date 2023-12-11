package gang_of_four.creational.generic_factory.my_imp;

public class MotorcycleBuilder implements MotorVehicleBuilder<Motorcycle> {
	@Override
	public Motorcycle build() {
		return new Motorcycle();
	}
}
