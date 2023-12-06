package associated_frameworks.dependency_injection.dagger;

import java.util.Set;

public class MyDaggerApp {
	public static void main(String[] args) {
		VehiclesComponent component = DaggerVehiclesComponent.create();
		Car car1 = component.buildCar();
		Car car2 = component.buildCar();
		Set.of(car1, car2).forEach(System.out::println);
	}
}
