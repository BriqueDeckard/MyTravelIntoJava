package structural.event_aggregator;

public class MyConcreteEventAggregatorC extends MyEventEmitter implements MyEventObserver {

	public MyConcreteEventAggregatorC() {
	}


	public MyConcreteEventAggregatorC(MyEventObserver observer, MyEvent event) {
		super(observer, event);
	}

	@Override
	public void onEvent(MyEvent e) {
		System.out.println("\tMyConcreteEventAggregatorC");
		notifyObserver(e);
	}
}
