package google_guice.basic;

import com.google.inject.AbstractModule;

public class MyBasicModule extends AbstractModule {
	@Override
	protected void configure() {
		bind(MyInjectedServiceContract.class).to(MyInjectedServiceContractImpl.class);
		bind(MyServiceUsingInjectedFields.class).toInstance(new MyServiceUsingInjectedFields(true));
	}
}
