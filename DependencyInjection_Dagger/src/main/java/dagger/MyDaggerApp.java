package dagger;

import dagger.example.Car;
import dagger.example.DaggerVehiclesComponent;
import dagger.example.VehiclesComponent;
import dagger.myimp.DaggerMyDaggerComponent;
import dagger.myimp.MyDaggerComponent;
import dagger.myimp.MyService;
import java.util.Set;

public class MyDaggerApp {
	public static void main(String[] args) {
		myImp();
		example();
	}

	private static void myImp() {
		MyDaggerComponent myDaggerComponent = DaggerMyDaggerComponent.create();
		MyService myService = myDaggerComponent.buildService();
		myService.doSomething();
	}

	private static void example() {
		VehiclesComponent component = DaggerVehiclesComponent.create();
		Car car1 = component.buildCar();
		Car car2 = component.buildCar();
		Set.of(car1, car2).forEach(System.out::println);
	}
}
