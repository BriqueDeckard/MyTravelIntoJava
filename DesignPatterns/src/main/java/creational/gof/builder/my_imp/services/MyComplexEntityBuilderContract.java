package creational.gof.builder.my_imp.services;

import creational.gof.builder.my_imp.domain.MyComplexEntity;

public interface MyComplexEntityBuilderContract {

	MyComplexEntity build();

	MyComplexEntity build(String name);
}
