package behavioral.gof.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class MyConcreteSubject implements MySubject{
	private List<MyObserver> observers = new ArrayList<>();
	private int state;

	public void setState(int state) {
		notifyObservers();
		this.state = state;
	}

	@Override
	public void registerObserver(MyObserver myObserver) {
		observers.add(myObserver);
	}

	@Override
	public void removeObserver(MyObserver myObserver) {
		observers.remove(myObserver);
	}

	@Override
	public void notifyObservers() {
		for(MyObserver myObserver : observers){
			myObserver.update();
		}
	}
}
