package design_patterns.prototype.example;

import design_patterns.prototype.my_imp.CarPrototype;

public class PrototypeApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		example();
		myImpl();
	}

	private static void myImpl() throws CloneNotSupportedException {
		CarPrototype carPrototype = new CarPrototype();
		carPrototype.setWheelNb(34);
		final CarPrototype clone = carPrototype.clone();
		System.out.println(clone.toString());
	}

	private static void example() throws CloneNotSupportedException {
		PrototypeImpl prototype = new PrototypeImpl();
		prototype.setValue("HELLO", "World!");
		prototype.setValue("COMBIEN", "42");
		final PrototypeImpl clone = prototype.clone();
		System.out.println(clone.getValue("HELLO"));
		System.out.println(clone.getValue("COMBIEN"));
	}
}
