package core_classes.dates;

import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

public interface MyZonedDateTimeContract {
	int compareTo(MyZonedDateTimeContract o, TimeUnit t);

	ZonedDateTime getZonedDateTime();
}
