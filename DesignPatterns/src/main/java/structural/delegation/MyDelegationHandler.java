package structural.delegation;

public class MyDelegationHandler implements MyDelegateContract {
	private final MyDelegateContract printer;

	public MyDelegationHandler(MyDelegateContract printer) {
		this.printer = printer;
	}

	@Override
	public void print(String message) {
		printer.print(message);
	}
}
