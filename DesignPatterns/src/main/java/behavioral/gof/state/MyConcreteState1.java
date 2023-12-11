package behavioral.gof.state;

public class MyConcreteState1 implements MyState{
	String name = "State 1";

	public String getName() {
		return name;
	}


	@Override
	public void doAction(MyContext context) {
		System.out.println("MyConcreteState1 state");
		context.setState(this);
	}
}
