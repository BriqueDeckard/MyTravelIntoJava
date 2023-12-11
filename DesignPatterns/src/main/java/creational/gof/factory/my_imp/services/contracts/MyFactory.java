package creational.gof.factory.my_imp.services.contracts;


import creational.gof.factory.my_imp.domain.contracts.MyEntityContract1;

public interface MyFactory {

	MyEntityContract1 build(String name);
}
