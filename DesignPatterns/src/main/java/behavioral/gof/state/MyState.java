package behavioral.gof.state;

public interface MyState {
	void doAction(MyContext context);
	String getName();
}