package behavioral.gof.memento;

public class MyMementoApp {
	public static void main(String[] args) {
		MyOriginator originator = new MyOriginator();
		MyCareTaker myCareTaker = new MyCareTaker();
		originator.setState("STATE_1");
		myCareTaker.add(originator.saveStateToMemento());
		originator.setState("STATE_2");
		myCareTaker.add(originator.saveStateToMemento());
		originator.setState("STATE_3");
		myCareTaker.add(originator.saveStateToMemento());

		System.out.println("Current state: " +originator.getState());
		originator.getStateFromMemento(myCareTaker.get(0));
		System.out.println("Previous state: " +originator.getState());
		originator.getStateFromMemento(myCareTaker.get(1));
		System.out.println("Previous state: " +originator.getState());
		originator.getStateFromMemento(myCareTaker.get(2));
		System.out.println("Previous state: " +originator.getState());
	}
}
