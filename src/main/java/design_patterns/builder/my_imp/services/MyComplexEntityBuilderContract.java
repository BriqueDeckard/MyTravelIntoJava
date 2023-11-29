package design_patterns.builder.my_imp.services;

import design_patterns.builder.my_imp.domain.MyComplexEntity;

public interface MyComplexEntityBuilderContract {

	MyComplexEntity build();

	MyComplexEntity build(String name);
}
