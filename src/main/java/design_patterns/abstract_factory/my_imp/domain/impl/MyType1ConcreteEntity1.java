package design_patterns.abstract_factory.my_imp.domain.impl;

import design_patterns.abstract_factory.my_imp.domain.contracts.MyEntityContract1;

public class MyType1ConcreteEntity1 implements MyEntityContract1 {
	@Override
	public void processEntity() {
		System.out.println("MyType1ConcreteEntity");
	}
}
