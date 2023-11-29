package design_patterns.generic_factory.my_imp;

public enum RecordBuilder {
	CAR {
		@Override
		public MotorVehicleBuilder<Car> make() {
			return new CarBuilder();
		}
	},
	MOTORCYCLE {
		@Override
		public MotorVehicleBuilder<Motorcycle> make() {
			return new MotorcycleBuilder();
		}
	};

	public abstract <T extends MotorVehicle> MotorVehicleBuilder<T> make();
}
