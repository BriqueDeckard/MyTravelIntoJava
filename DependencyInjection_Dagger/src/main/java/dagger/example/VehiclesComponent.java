package dagger.example;

import dagger.Component;
import javax.inject.Singleton;

// the class that will generate Car instances, injecting dependencies provided by VehiclesModule.
@Singleton
@Component(modules = VehiclesModule.class) // If we didn’t do that, Dagger wouldn’t know how to build the car’s dependencies.
public interface VehiclesComponent {
	Car buildCar();
}
