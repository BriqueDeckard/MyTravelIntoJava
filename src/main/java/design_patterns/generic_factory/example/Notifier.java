package design_patterns.generic_factory.example;

public interface Notifier<T> {
	void notify(T t);
}
