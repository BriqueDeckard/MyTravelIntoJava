package structural.event_aggregator;

public class MyConcreteEventEmitterA extends MyEventEmitter implements MyEventObserver {

	public MyConcreteEventEmitterA() {
	}


	@Override
	public void onEvent(MyEvent e) {
		notifyObserver(e);
	}

	public void emitSomething() {
		System.out.println("\tMyConcreteEventEmitterA");
		MyEvent myEvent = MyEvent.EVENT_TYPE_1;
		notifyObserver(myEvent);
	}
}
