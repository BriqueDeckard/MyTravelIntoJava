package creational.registry;

public interface MyRegistryContract<T, K> {

	T add(T t);

	T get(K id);
}
