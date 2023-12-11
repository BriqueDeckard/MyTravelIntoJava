package gang_of_four.creational.abstract_factory.my_imp.domain.impl;

import gang_of_four.creational.abstract_factory.my_imp.domain.contracts.MyEntityContract1;

public class MyType1ConcreteEntity1 implements MyEntityContract1 {
	@Override
	public void processEntity() {
		System.out.println("MyType1ConcreteEntity");
	}
}
