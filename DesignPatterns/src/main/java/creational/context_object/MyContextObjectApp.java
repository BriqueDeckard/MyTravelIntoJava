package creational.context_object;

public class MyContextObjectApp {
	private static final String SERVICE = "SERVICE";
	public static void main(String[] args) {
		ConcreteLayerA concreteLayerA = new ConcreteLayerA();
		concreteLayerA.addAimAInfo(SERVICE);
		System.out.println("Context: " + concreteLayerA.getContext());
		ConcreteLayerB concreteLayerB = new ConcreteLayerB(concreteLayerA);
		concreteLayerB.addAimBInfo(SERVICE);
		System.out.println("Context: " + concreteLayerA.getContext());
		ConcreteLayerC concreteLayerC = new ConcreteLayerC(concreteLayerB);
		concreteLayerC.addAimCInfo(SERVICE);
		System.out.println("Context: " + concreteLayerA.getContext());
	}
}
