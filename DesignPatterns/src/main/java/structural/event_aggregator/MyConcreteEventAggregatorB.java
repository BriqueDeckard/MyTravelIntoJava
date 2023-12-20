package structural.event_aggregator;

public class MyConcreteEventAggregatorB extends MyEventEmitter implements MyEventObserver {

	public MyConcreteEventAggregatorB() {
	}


	public MyConcreteEventAggregatorB(MyEventObserver observer, MyEvent event) {
		super(observer, event);
	}

	@Override
	public void onEvent(MyEvent e) {

		System.out.println("\tMyConcreteEventAggregatorB");
		notifyObserver(e);
	}
}
