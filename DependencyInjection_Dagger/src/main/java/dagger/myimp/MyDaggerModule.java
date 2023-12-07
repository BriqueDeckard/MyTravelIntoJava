package dagger.myimp;

import dagger.Module;
import dagger.Provides;

@Module
public class MyDaggerModule {
	@Provides
	public MyOtherService provideMyOtherService() {
		return new MyOtherService();
	}
}
