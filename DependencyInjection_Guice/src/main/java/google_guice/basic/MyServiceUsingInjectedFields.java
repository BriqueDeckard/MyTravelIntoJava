package google_guice.basic;

import javax.inject.Inject;

public class MyServiceUsingInjectedFields {
	@Inject
	private MyInjectedServiceContract myInjectedServiceContract;

	@Inject
	public MyServiceUsingInjectedFields(Boolean myBooleanValue) {
		System.out.println("Enabled : " + myBooleanValue);

	}

	public boolean doSomething(String message) {

		return myInjectedServiceContract.doSomethingWithString(message);
	}


}
