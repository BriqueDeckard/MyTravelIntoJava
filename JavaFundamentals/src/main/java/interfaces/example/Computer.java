package interfaces.example;

public class Computer implements Electronic {
	@Override
	public int getElectricityInUse() {
		return 42;
	}

	@Override
	public void printDescription() {
		Electronic.super.printDescription();
		System.out.println("Computer");
	}
}
