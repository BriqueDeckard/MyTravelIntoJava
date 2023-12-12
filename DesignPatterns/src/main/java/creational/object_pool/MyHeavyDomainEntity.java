package creational.object_pool;

import java.util.concurrent.atomic.AtomicInteger;

public class MyHeavyDomainEntity {
	private static final AtomicInteger counter = new AtomicInteger(0);

	private final int id;

	public MyHeavyDomainEntity() {
		id = counter.incrementAndGet();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "MyHeavyDomainEntity{" +
				"id=" + id +
				'}';
	}
}
