package creational.gof.prototype.my_imp;

public class CarPrototype extends MotorizedVehicleAbstract implements Cloneable {
	@Override
	public CarPrototype clone() throws CloneNotSupportedException {
		CarPrototype carPrototype = new CarPrototype();
		carPrototype.setBrand("BRAND");
		carPrototype.setWheelNb(wheelNb);
		return carPrototype;
	}

	@Override
	public String toString() {
		return "CarPrototype{" +
				"wheelNb=" + wheelNb +
				", brand='" + brand + '\'' +
				'}';
	}
}
