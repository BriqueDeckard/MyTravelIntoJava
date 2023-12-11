package creational.context_object;

public class ConcreteLayerB {
	private static MyServiceContext context;

	public ConcreteLayerB(ConcreteLayerA concreteLayerA)
	{
		context = concreteLayerA.getContext();
	}

	public static MyServiceContext getContext() {
		return context;
	}


	public void addAimBInfo(String accountService) {
		context.setAIM_B_SERVICE(accountService);
	}
}
