package creational.object_pool;

public class MyHeavyDomainEntityPool extends ObjectPool<MyHeavyDomainEntity> {
	@Override
	protected MyHeavyDomainEntity create() {
		return new MyHeavyDomainEntity();
	}
}
