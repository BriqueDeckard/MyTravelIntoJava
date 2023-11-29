package design_patterns.generic_factory.my_imp;

public class CarBuilder implements MotorVehicleBuilder<Car> {
	@Override
	public Car build() {
		return new Car();
	}
}
