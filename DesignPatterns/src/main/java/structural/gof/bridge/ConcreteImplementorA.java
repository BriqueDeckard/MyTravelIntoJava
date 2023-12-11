package structural.gof.bridge;

public class ConcreteImplementorA implements Implementor {
	@Override
	public void operationImpl() {
		System.out.println("operationImpl A");
	}
}
