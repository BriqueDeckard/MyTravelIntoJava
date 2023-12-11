package structural.bridge;

public class MyBridgeApp {
	public static void main(String[] args) {
		Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
		abstraction.operation();
		abstraction = new RefinedAbstraction(new ConcreteImplementorB());
		abstraction.operation();
	}
}
