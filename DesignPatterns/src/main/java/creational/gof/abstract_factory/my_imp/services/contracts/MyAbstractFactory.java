package creational.gof.abstract_factory.my_imp.services.contracts;


import creational.gof.abstract_factory.my_imp.domain.contracts.MyEntityContract1;
import creational.gof.abstract_factory.my_imp.domain.contracts.MyEntityContract2;

public abstract class MyAbstractFactory {
	public abstract MyEntityContract1 buildType1();

	public abstract MyEntityContract2 buildType2();

}
