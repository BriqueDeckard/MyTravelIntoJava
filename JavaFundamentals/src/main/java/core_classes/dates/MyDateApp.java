package core_classes.dates;

import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

public class MyDateApp {
	public static void main(String[] args) {
		MyZonedDateTimeImp date1 = new MyZonedDateTimeImp(ZonedDateTime.now());
		for (int i = 0; i < 999999; i++) {
			MyZonedDateTimeImp date2 = new MyZonedDateTimeImp(ZonedDateTime.now());
			System.out.println(date2);
		}
		MyZonedDateTimeImp date3 = new MyZonedDateTimeImp(ZonedDateTime.now());
		System.out.println(date1.compareTo(date3, TimeUnit.MILLISECONDS));

	}
}
