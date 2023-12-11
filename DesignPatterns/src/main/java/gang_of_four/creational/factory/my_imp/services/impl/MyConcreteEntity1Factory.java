package gang_of_four.creational.factory.my_imp.services.impl;

import gang_of_four.creational.factory.my_imp.domain.contracts.MyEntityContract1;
import gang_of_four.creational.factory.my_imp.domain.impl.MyConcreteEntity1;
import gang_of_four.creational.factory.my_imp.services.contracts.MyFactory;

public class MyConcreteEntity1Factory implements MyFactory {
	@Override
	public MyEntityContract1 build(String name) {
		MyConcreteEntity1 myConcreteEntity1 = new MyConcreteEntity1();
		myConcreteEntity1.setName(name);
		return myConcreteEntity1;
	}
}
