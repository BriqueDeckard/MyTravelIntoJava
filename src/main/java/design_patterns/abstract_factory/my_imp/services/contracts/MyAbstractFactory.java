package design_patterns.abstract_factory.my_imp.services.contracts;

import design_patterns.abstract_factory.my_imp.domain.contracts.MyEntityContract1;
import design_patterns.abstract_factory.my_imp.domain.contracts.MyEntityContract2;

public abstract class MyAbstractFactory {
	public abstract MyEntityContract1 buildType1();

	public abstract MyEntityContract2 buildType2();

}
