package gang_of_four.structural.bridge;

public class ConcreteImplementorA implements Implementor {
	@Override
	public void operationImpl() {
		System.out.println("operationImpl A");
	}
}
