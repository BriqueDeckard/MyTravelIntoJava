package interfaces.my_imp;

public interface MyInterface {
	@SuppressWarnings("ConstantValue")
	static boolean myStaticMethod() {
		return (2 + 42 == 44);
	}

	boolean myAbstractMethod();

	@SuppressWarnings("ConstantValue")
	default boolean myDefaultMethod() {
		return (42 - 2 == 40);
	}
}
