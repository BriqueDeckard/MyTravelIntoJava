package interfaces;

import java_fundamentals.interfaces.example.Computer;
import java_fundamentals.interfaces.example.Electronic;
import java_fundamentals.interfaces.my_imp.MyConcrete;
import java_fundamentals.interfaces.my_imp.MyInterface;

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
