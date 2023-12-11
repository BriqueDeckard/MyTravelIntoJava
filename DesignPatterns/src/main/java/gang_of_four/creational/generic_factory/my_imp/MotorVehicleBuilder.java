package gang_of_four.creational.generic_factory.my_imp;

public interface MotorVehicleBuilder<T extends MotorVehicle> {
	T build();
}
