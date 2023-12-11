package gang_of_four.creational.builder.my_imp.services;

import gang_of_four.creational.builder.my_imp.domain.MyComplexEntity;

public interface MyComplexEntityBuilderContract {

	MyComplexEntity build();

	MyComplexEntity build(String name);
}
