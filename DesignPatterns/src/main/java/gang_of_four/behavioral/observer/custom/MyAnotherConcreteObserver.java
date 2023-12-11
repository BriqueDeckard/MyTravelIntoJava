package gang_of_four.behavioral.observer.custom;

public class MyAnotherConcreteObserver implements MyObserver {
	@Override
	public void update() {
		System.out.println("MyAnotherConcreteObserver : Do something different. Think out of the box.");
	}
}
