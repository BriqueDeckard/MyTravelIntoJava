package creational.gof.generic_factory.my_imp;

public interface MotorVehicleBuilder<T extends MotorVehicle> {
	T build();
}
