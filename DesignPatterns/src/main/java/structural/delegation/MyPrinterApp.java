package structural.delegation;

public class MyPrinterApp {
	public static void main(String[] args) {
		String MESSAGE_TO_PRINT = "Hello world";
		MyPrinterController myPrinterControllerA = new MyPrinterController(new MyConcretePrinterA());
		myPrinterControllerA.print(MESSAGE_TO_PRINT);
		MyPrinterController myPrinterControllerB = new MyPrinterController(new MyConcretePrinterB());
		myPrinterControllerB.print(MESSAGE_TO_PRINT);

	}
}
