package structural.event_aggregator;

public class MyConcreteEventEmitterB extends MyEventEmitter implements MyEventObserver {

	public MyConcreteEventEmitterB(MyEventObserver observer, MyEvent event) {
		super(observer, event);
	}

	@Override
	public void onEvent(MyEvent e) {
		notifyObserver(e);
	}

	public void emitSomething() {
		System.out.println("\tMyConcreteEventEmitterB");
		MyEvent myEvent = MyEvent.EVENT_TYPE_2;
		notifyObserver(myEvent);
	}
}
