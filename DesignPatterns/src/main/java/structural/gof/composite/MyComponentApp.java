package structural.gof.composite;

public class MyComponentApp {
	public static void main(String[] args) {
		Component leaf1 = new ConcreteLeaf1();
		Component leaf2 = new ConcreteLeaf2();
		Composite composite = new Composite();
		composite.addLeaf(leaf1);
		composite.addLeaf(leaf2);
		composite.doSomething("COMMON COLOR");
	}
}
