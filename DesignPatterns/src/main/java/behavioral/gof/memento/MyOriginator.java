package behavioral.gof.memento;

public class MyOriginator {
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public MyMemento saveStateToMemento(){
		return new MyMemento(state);
	}

	public void getStateFromMemento(MyMemento memento){
		state = memento.getState();
	}
}
