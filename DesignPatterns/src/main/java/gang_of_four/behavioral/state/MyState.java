package gang_of_four.behavioral.state;

public interface MyState {
	void doAction(MyContext context);
	String getName();
}