package gang_of_four.behavioral.state;

public class MyStateApp {
	public static void main(String[] args) {
		MyContext context = new MyContext();

		MyConcreteState1 myConcreteState1 = new MyConcreteState1();
		myConcreteState1.doAction(context);

		System.out.println(context.getState());

		MyConcreteState2 myConcreteState2 = new MyConcreteState2();
		myConcreteState2.doAction(context);

		System.out.println(context.getState());
	}
}
