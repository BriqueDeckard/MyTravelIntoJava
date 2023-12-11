package gang_of_four.creational.factory.my_imp.services.contracts;


import gang_of_four.creational.factory.my_imp.domain.contracts.MyEntityContract1;

public interface MyFactory {

	MyEntityContract1 build(String name);
}
