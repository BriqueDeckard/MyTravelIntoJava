package creational.builder.my_imp.services;


import creational.builder.my_imp.domain.MyComplexEntity;

public class MyComplexEntityBuilder implements MyComplexEntityBuilderContract {
	@Override
	public MyComplexEntity build() {
		MyComplexEntity myComplexEntity = new MyComplexEntity();
		myComplexEntity.setBrand("BRAND1");
		myComplexEntity.setCode(1);
		myComplexEntity.setKey("KEY1");
		myComplexEntity.setName("NAME");
		return myComplexEntity;
	}

	@Override
	public MyComplexEntity build(String name) {
		MyComplexEntity myComplexEntity = build();
		myComplexEntity.setName(name);
		return myComplexEntity;
	}
}
