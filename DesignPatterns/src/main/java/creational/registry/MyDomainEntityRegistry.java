package creational.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyDomainEntityRegistry implements MyRegistryContract<MyDomainEntity, String> {
	private static final MyRegistryContract instance = new MyDomainEntityRegistry();

	private final Map<String, MyDomainEntity> myMap;

	public MyDomainEntityRegistry() {
		this.myMap = new ConcurrentHashMap<>();
	}

	@Override
	public MyDomainEntity add(MyDomainEntity myDomainEntity) {
		return myMap.put(myDomainEntity.getId(), myDomainEntity);
	}

	@Override
	public MyDomainEntity get(String id) {
		return myMap.get(id);
	}
}
