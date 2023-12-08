package behavioral.observer.custom;

public class MyCustomObserverApp {
	public static void main(String[] args) {
		MySubject mySubject = new MyConcreteSubject();
		MyObserver myObserver = new MyConcreteObserver();
		MyObserver myAnotherObserver = new MyAnotherConcreteObserver();
		mySubject.registerObserver(myObserver);
		mySubject.registerObserver(myAnotherObserver);
		mySubject.notifyObservers();
	}
}
