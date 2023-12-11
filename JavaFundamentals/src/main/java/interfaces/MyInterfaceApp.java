package interfaces;


import interfaces.example.Computer;
import interfaces.example.Electronic;
import interfaces.my_imp.MyConcrete;
import interfaces.my_imp.MyInterface;

public class MyInterfaceApp {
	public static void main(String[] args) {
		myImpl();
		example();
	}

	private static void myImpl() {
		MyInterface myConcrete = new MyConcrete();
		System.out.println(myConcrete.myAbstractMethod());
		System.out.println(myConcrete.myDefaultMethod());
		System.out.println(MyInterface.myStaticMethod());
	}

	private static void example() {
		Electronic computer = new Computer();
		System.out.println(computer.getElectricityInUse());
		computer.printDescription();
		System.out.println(Electronic.isEnergyEfficient("WATT"));
		System.out.println(Electronic.isEnergyEfficient("LED"));
	}
}
