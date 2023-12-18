package structural.delegation;

public class MyDelegateApp {
	public static void main(String[] args) {
		String MESSAGE_TO_PRINT = "Hello world";
		MyDelegationHandler myDelegationHandlerA = new MyDelegationHandler(new MyConcreteDelegateA());
		myDelegationHandlerA.print(MESSAGE_TO_PRINT);
		MyDelegationHandler myDelegationHandlerB = new MyDelegationHandler(new MyConcreteDelegateB());
		myDelegationHandlerB.print(MESSAGE_TO_PRINT);

	}
}
