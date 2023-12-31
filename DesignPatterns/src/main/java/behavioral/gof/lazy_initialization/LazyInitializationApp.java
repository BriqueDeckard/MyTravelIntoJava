package behavioral.gof.lazy_initialization;

import behavioral.gof.lazy_initialization.example.LaziPi;
import behavioral.gof.lazy_initialization.my_imp.MyEntity;

public class LazyInitializationApp {
	public static void main(String[] args) {
		example();
		MyEntity myEntity = new MyEntity();
		System.out.println(myEntity);
		System.out.println(myEntity.getMyInternalObject());
		System.out.println(myEntity);
	}

	private static void example() {
		LaziPi laziPi = new LaziPi();
		System.out.println("Not initialized : " + laziPi);
		System.out.println(laziPi.getValue());
		System.out.println("Initialized : " + laziPi);
	}
}
