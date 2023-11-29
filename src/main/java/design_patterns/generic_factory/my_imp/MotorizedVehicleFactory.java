package design_patterns.generic_factory.my_imp;

public class MotorizedVehicleFactory {

	public <T extends MotorVehicle> MotorVehicleBuilder<T> getMotorVehicleBuilder(Class<T> c) {
		if (c == Car.class) {
			return RecordBuilder.CAR.make();
		}
		if (c == Motorcycle.class) {
			return RecordBuilder.MOTORCYCLE.make();
		}
		return null;
	}
}
