package behavioral.gof.observer.java_utils;

import java.util.Observable;
import java.util.Observer;

public class MyObserverA implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("MyObserverA has been notified :");
		System.out.println("o : " + o);
		System.out.println("arg : " + arg);
	}
}
