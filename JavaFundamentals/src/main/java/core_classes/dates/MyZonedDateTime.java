package core_classes.dates;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public abstract class MyZonedDateTime implements MyZonedDateTimeContract {
	final ZonedDateTime zonedDateTime;

	public MyZonedDateTime(ZonedDateTime zonedDateTime) {
		this.zonedDateTime = zonedDateTime;
	}

	@Override
	public int compareTo(MyZonedDateTimeContract d, TimeUnit t) {
		ZonedDateTime o = d.getZonedDateTime();
		switch (t) {
			case DAYS -> {
				return o.truncatedTo(ChronoUnit.DAYS).compareTo(this.zonedDateTime.truncatedTo(ChronoUnit.DAYS));
			}
			case HOURS -> {
				return o.truncatedTo(ChronoUnit.HOURS).compareTo(this.zonedDateTime.truncatedTo(ChronoUnit.HOURS));
			}
			case MINUTES -> {
				return o.truncatedTo(ChronoUnit.MINUTES).compareTo(this.zonedDateTime.truncatedTo(ChronoUnit.MINUTES));
			}
			case SECONDS -> {
				return o.truncatedTo(ChronoUnit.SECONDS).compareTo(this.zonedDateTime.truncatedTo(ChronoUnit.SECONDS));
			}
			case MILLISECONDS -> {
				return o.truncatedTo(ChronoUnit.MILLIS).compareTo(this.zonedDateTime.truncatedTo(ChronoUnit.MILLIS));
			}
			case MICROSECONDS -> {
				return o.truncatedTo(ChronoUnit.MICROS).compareTo(this.zonedDateTime.truncatedTo(ChronoUnit.MICROS));
			}
		}
		return 0;
	}

	@Override
	public ZonedDateTime getZonedDateTime() {
		return zonedDateTime;
	}
}
