package structural.delegation;

public class MyPrinterController implements MyPrinterContract{
	private final MyPrinterContract printer;

	public MyPrinterController(MyPrinterContract printer) {
		this.printer = printer;
	}

	@Override
	public void print(String message) {
		printer.print(message);
	}
}
