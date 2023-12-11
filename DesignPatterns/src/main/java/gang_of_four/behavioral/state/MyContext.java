package gang_of_four.behavioral.state;

public class MyContext {
	private MyState state;

	public MyState getState() {
		return state;
	}

	public void setState(MyState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "MyContext{" +
				"state=" + state +
				'}';
	}
}
