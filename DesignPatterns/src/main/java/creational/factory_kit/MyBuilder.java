package creational.factory_kit;

import java.util.function.Supplier;

/**
 * a functional interface that allows adding a builder with a name to the factory
 */
public interface MyBuilder {
	void add(MyDomainEnum name, Supplier<MyDomainContract> supplier);
}
