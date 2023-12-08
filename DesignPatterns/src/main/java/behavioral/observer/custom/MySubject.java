package behavioral.observer.custom;

public interface MySubject {
	void registerObserver(MyObserver myObserver);
	void removeObserver(MyObserver myObserver);
	void notifyObservers();
}
