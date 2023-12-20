package structural.event_aggregator;

public class MyConcreteEventObserver implements MyEventObserver {
	@Override
	public void onEvent(MyEvent e) {
		System.out.println("Received event from MyConcreteObserver : " + e.toString());
	}
}
