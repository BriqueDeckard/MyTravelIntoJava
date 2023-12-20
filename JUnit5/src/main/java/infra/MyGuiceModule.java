package infra;

import com.google.inject.AbstractModule;
import services.contracts.MyService;
import services.imp.MyServiceImp;

public class MyGuiceModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MyService.class).to(MyServiceImp.class);
	}
}
