package advanced_concepts.recursivity.di;

import advanced_concepts.recursivity.services.MyRecursivityService;
import advanced_concepts.recursivity.services.MyUserService;
import dagger.Module;
import dagger.Provides;

@Module
public class RecursivityServiceModule {
	@Provides
	public MyRecursivityService provideMyRecursivityService() {
		return new MyRecursivityService();
	}

	@Provides
	public MyUserService provideMyUserService() {
		return new MyUserService();
	}
}
