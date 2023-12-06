package design_patterns.factory.my_imp.services.impl;

import design_patterns.factory.my_imp.domain.contracts.MyEntityContract1;
import design_patterns.factory.my_imp.domain.impl.MyConcreteEntity2;
import design_patterns.factory.my_imp.services.contracts.MyFactory;

public class MyConcreteEntity2Factory implements MyFactory {
	@Override
	public MyEntityContract1 build(String name) {
		MyConcreteEntity2 myConcreteEntity2 = new MyConcreteEntity2();
		myConcreteEntity2.setName(name);
		return myConcreteEntity2;
	}
}