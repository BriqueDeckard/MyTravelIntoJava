package creational.factory.my_imp.domain.impl;

import creational.factory.my_imp.domain.contracts.MyEntityContract1;

public class MyConcreteEntity1 implements MyEntityContract1 {
	String name;

	@Override
	public void doSomething() {
		System.out.println("Concrete entity 1 : " + name);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
}
