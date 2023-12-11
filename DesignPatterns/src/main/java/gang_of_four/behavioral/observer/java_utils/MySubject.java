package gang_of_four.behavioral.observer.java_utils;

import java.util.Observable;

// Cette classe doit appeler la méthode setChanged() suivie de notifyObservers() pour notifier les observateurs de tout changement dans son état.
public class MySubject extends Observable {
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}

	@Override
	public String toString() {
		return "MySubject{" +
				"state=" + state +
				'}';
	}
}
