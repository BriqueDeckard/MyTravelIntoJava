package creational.abstract_factory.my_imp.services.impl;

import creational.abstract_factory.my_imp.domain.contracts.MyEntityContract1;
import creational.abstract_factory.my_imp.domain.contracts.MyEntityContract2;
import creational.abstract_factory.my_imp.domain.impl.MyType1ConcreteEntity1;
import creational.abstract_factory.my_imp.domain.impl.MyType2ConcreteEntity1;
import creational.abstract_factory.my_imp.services.contracts.MyAbstractFactory;

public class MyConcreteAFactory1 extends MyAbstractFactory {
	@Override
	public MyEntityContract1 buildType1() {
		return new MyType1ConcreteEntity1();
	}

	@Override
	public MyEntityContract2 buildType2() {
		return new MyType2ConcreteEntity1();
	}
}
