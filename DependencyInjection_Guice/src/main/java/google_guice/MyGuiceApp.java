package google_guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import google_guice.basic.MyBasicModule;
import google_guice.basic.MyServiceUsingInjectedFields;
import google_guice.basic.MyInjectedServiceContract;

public class MyGuiceApp {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new MyBasicModule());
		MyInjectedServiceContract instance = injector.getInstance(MyInjectedServiceContract.class);
		instance.doSomethingWithString("hello ?");
		MyServiceUsingInjectedFields myServiceUsingInjectedFields1 = injector.getInstance(MyServiceUsingInjectedFields.class);
		myServiceUsingInjectedFields1.doSomething("Yo ! ");
	}
}
