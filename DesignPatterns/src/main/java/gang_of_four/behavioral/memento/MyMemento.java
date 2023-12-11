package gang_of_four.behavioral.memento;

public class MyMemento {
	private String state;

	public MyMemento(String state){
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
