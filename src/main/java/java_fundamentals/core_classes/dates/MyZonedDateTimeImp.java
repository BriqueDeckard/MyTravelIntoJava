package java_fundamentals.core_classes.dates;

import java.time.ZonedDateTime;

public class MyZonedDateTimeImp extends MyZonedDateTime {
	public MyZonedDateTimeImp(ZonedDateTime zonedDateTime) {
		super(zonedDateTime);
	}

	@Override
	public String toString() {
		return "MyZonedDateTimeImp{" +
				"zonedDateTime=" + zonedDateTime +
				'}';
	}
}
