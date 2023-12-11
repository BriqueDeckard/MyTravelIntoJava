package creational.context_object;

public class ConcreteLayerA {
	private static MyServiceContext context;

	public ConcreteLayerA() {
		context = MyServiceContextFactoryContract.createContext();
	}

	public static MyServiceContext getContext() {
		return context;
	}


	public void addAimAInfo(String accountService) {
		context.setAIM_A_SERVICE(accountService);
	}
}
