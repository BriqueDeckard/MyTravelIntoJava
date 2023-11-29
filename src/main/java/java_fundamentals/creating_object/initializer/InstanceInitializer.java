package java_fundamentals.creating_object.initializer;

public class InstanceInitializer {
	final int id;

	{
		id = 10;
	}

	public void printId() {
		System.out.println(id);
	}
}
