package gang_of_four.behavioral.state;

public class MyConcreteState2 implements MyState{
	String name = "State 2";

	public String getName() {
		return name;
	}

	@Override
	public void doAction(MyContext context) {
		System.out.println("MyConcreteState2 state");
		context.setState(this);
	}
}
