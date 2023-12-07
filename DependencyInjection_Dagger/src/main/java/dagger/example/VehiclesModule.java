package dagger.example;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

// a class that provides or builds the objects’ dependencies
@Module
public class VehiclesModule {
	@Provides
	public Engine provideEngine() {
		return new Engine("V2");
	}

	@Provides
	@Singleton
	public Brand provideBrand() {
		return new Brand("Deqart");
	}
}
