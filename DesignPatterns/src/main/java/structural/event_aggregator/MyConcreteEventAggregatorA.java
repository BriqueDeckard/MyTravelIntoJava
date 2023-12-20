package structural.event_aggregator;

public class MyConcreteEventAggregatorA extends MyEventEmitter implements MyEventObserver {

	public MyConcreteEventAggregatorA() {
	}


	public MyConcreteEventAggregatorA(MyEventObserver observer, MyEvent event) {
		super(observer, event);
	}

	@Override
	public void onEvent(MyEvent e) {
		System.out.println("\tMyConcreteEventAggregatorA");
		notifyObserver(e);
	}
}
