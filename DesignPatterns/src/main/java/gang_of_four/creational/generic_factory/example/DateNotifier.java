package gang_of_four.creational.generic_factory.example;

import java.util.Date;

public class DateNotifier implements Notifier<Date> {
	@Override
	public void notify(Date date) {
		System.out.println("Notifying: " + date);
	}
}
