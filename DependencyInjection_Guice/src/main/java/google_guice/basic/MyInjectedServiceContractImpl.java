package google_guice.basic;

public class MyInjectedServiceContractImpl implements MyInjectedServiceContract {
	@Override
	public boolean doSomethingWithString(String message) {
		System.out.println("##_" + message + "_##");
		return true;
	}
}
