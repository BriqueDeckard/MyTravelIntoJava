package creational.context_object;

public class ConcreteLayerC {
	private static MyServiceContext context;

	public ConcreteLayerC(ConcreteLayerB concreteLayerB)
	{
		context = concreteLayerB.getContext();
	}

	public static MyServiceContext getContext() {
		return context;
	}


	public void addAimCInfo(String accountService) {
		context.setAIM_C_SERVICE(accountService);
	}
}
