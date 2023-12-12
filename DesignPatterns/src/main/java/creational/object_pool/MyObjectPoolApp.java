package creational.object_pool;

public class MyObjectPoolApp {
	public static void main(String[] args) {
		var pool = new MyHeavyDomainEntityPool();
		System.out.println(pool);
		MyHeavyDomainEntity myHeavyDomainEntity1 = pool.checkOut();
		System.out.println(pool);
		MyHeavyDomainEntity myHeavyDomainEntity2 = pool.checkOut();
		System.out.println(pool);
		MyHeavyDomainEntity myHeavyDomainEntity3 = pool.checkOut();
		System.out.println(pool);
		pool.checkIn(myHeavyDomainEntity1);
		System.out.println(pool);
		pool.checkIn(myHeavyDomainEntity2);
		System.out.println(pool);
		MyHeavyDomainEntity myHeavyDomainEntity4 = pool.checkOut();
		System.out.println(pool);
		MyHeavyDomainEntity myHeavyDomainEntity5 = pool.checkOut();
		System.out.println(pool);

	}
}
