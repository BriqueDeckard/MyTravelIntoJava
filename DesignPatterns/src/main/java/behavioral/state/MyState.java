package behavioral.state;

import javax.naming.Context;

public interface MyState {
	void doAction(MyContext context);
	String getName();
}