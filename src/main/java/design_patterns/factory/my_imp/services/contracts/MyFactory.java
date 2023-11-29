package design_patterns.factory.my_imp.services.contracts;

import design_patterns.factory.my_imp.domain.contracts.MyEntityContract1;

public interface MyFactory {

	MyEntityContract1 build(String name);
}
