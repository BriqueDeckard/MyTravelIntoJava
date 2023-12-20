package structural.event_aggregator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MyEventEmitter {
	private final Map<MyEvent, List<MyEventObserver>> observerLists;

	public MyEventEmitter() {
		this.observerLists = new HashMap<>();
	}

	public MyEventEmitter(MyEventObserver observer, MyEvent event) {
		this.observerLists = new HashMap<>();
		registerObserver(observer, event);
	}

	public final void registerObserver(MyEventObserver observer, MyEvent e) {
		this.observerLists.put(e, List.of(observer));
	}

	public final void notifyObserver(MyEvent event) {
		this.observerLists.get(event).forEach(observer -> observer.onEvent(event));
	}
}
