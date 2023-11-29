package java_fundamentals.interfaces.my_imp;

public class MyConcrete implements MyInterface {
	@SuppressWarnings("ConstantValue")
	@Override
	public boolean myAbstractMethod() {
		return 43 - 3 == 40;
	}

	@SuppressWarnings("EmptyMethod")
	@Override
	public boolean myDefaultMethod() {
		return MyInterface.super.myDefaultMethod();
	}
}
