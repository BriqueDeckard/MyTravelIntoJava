package gang_of_four.behavioral.observer.custom;

public interface MySubject {
	void registerObserver(MyObserver myObserver);
	void removeObserver(MyObserver myObserver);
	void notifyObservers();
}
