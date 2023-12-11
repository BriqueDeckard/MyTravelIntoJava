package creational.builder.my_imp.services;

import creational.builder.my_imp.domain.MyComplexEntity;

public interface MyComplexEntityBuilderContract {

	MyComplexEntity build();

	MyComplexEntity build(String name);
}
