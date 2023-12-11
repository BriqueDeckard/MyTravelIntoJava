package gang_of_four.structural.bridge;

public class ConcreteImplementorB implements Implementor {
	@Override
	public void operationImpl() {
		System.out.println("operationImpl B");
	}
}
