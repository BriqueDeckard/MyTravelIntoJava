package creational.context_object;

public interface MyServiceContextFactoryContract {
	static MyServiceContext createContext() {
		return new MyServiceContext();
	}
}
