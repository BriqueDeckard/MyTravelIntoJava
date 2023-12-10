package creational.prototype;


import creational.prototype.example.first.PrototypeImpl;
import creational.prototype.example.second.MyCircle;
import creational.prototype.example.second.MyShape;
import creational.prototype.my_imp.CarPrototype;

public class PrototypeApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		example1();
		myImpl();
		example2();
	}

	private static void example2() {
		MyCircle myCircle = new MyCircle("Circle");
		MyShape circleClone = myCircle.clone();
		System.out.println(myCircle);
		System.out.println(circleClone);
	}

	private static void myImpl() throws CloneNotSupportedException {
		CarPrototype carPrototype = new CarPrototype();
		carPrototype.setWheelNb(34);
		final CarPrototype clone = carPrototype.clone();
		System.out.println(clone.toString());
	}

	private static void example1() throws CloneNotSupportedException {
		PrototypeImpl prototype = new PrototypeImpl();
		prototype.setValue("HELLO", "World!");
		prototype.setValue("COMBIEN", "42");
		final PrototypeImpl clone = prototype.clone();
		System.out.println(clone.getValue("HELLO"));
		System.out.println(clone.getValue("COMBIEN"));
	}
}
