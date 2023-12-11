package gang_of_four.creational.abstract_factory.my_imp.domain.impl;

import gang_of_four.creational.abstract_factory.my_imp.domain.contracts.MyEntityContract2;

public class MyType2ConcreteEntity1 implements MyEntityContract2 {
	@Override
	public void processEntity() {
		System.out.println("MyType2ConcreteEntity");
	}
}
