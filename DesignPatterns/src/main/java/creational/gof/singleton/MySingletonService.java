package creational.gof.singleton;

public class MySingletonService {
	private static MySingletonService instance;

	public static MySingletonService getInstance() {
		if (instance == null) {
			instance = new MySingletonService();
		}
		return instance;
	}

	public void doSomething() {
		System.out.println("Do something from a Singleton.");
	}
}
