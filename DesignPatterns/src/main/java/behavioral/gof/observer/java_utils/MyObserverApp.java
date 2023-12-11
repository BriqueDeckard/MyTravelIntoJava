package behavioral.gof.observer.java_utils;

public class MyObserverApp {
	public static void main(String[] args) {
		MySubject subject = new MySubject();
		MyObserverA observerA = new MyObserverA();
		subject.addObserver(observerA);

		subject.setState(10);
	}
}
