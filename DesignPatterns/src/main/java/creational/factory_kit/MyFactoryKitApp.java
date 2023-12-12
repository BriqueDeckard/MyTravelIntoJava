package creational.factory_kit;

import java.util.ArrayList;

public class MyFactoryKitApp {
	public static void main(String[] args) {
		// Initializing factory with builders
		MyDomainEntityFactory factory = MyDomainEntityFactory.factory(builder -> {
			builder.add(MyDomainEnum.VALUE_1, MyDomainEntityImpA::new);
			builder.add(MyDomainEnum.VALUE_2, MyDomainEntityImpB::new);
		});
		// Using factory
		ArrayList<MyDomainContract> list = new ArrayList<>();
		list.add(factory.create(MyDomainEnum.VALUE_1));
		list.add(factory.create(MyDomainEnum.VALUE_2));
		list.forEach(domainEntity -> System.out.println(domainEntity.toString()));
	}
}
