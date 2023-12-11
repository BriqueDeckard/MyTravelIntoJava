package behavioral.gof.observer.custom;

public class MyConcreteObserver implements MyObserver{
	@Override
	public void update() {
		System.out.println("MyConcreteObserver 1 : notified !");
	}
}
