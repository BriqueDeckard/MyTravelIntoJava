package creating_object.initializer;

public class StaticInitializer {
	private static final String subject;

	static {
		subject = "Hello world";
	}

	public static String getSubject() {
		return subject;
	}
}
