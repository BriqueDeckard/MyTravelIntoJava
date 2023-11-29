package java_fundamentals.core_classes.java_generics;

import java.util.Arrays;

public class MyGenericMethodContainer {
	public <T> void fromArrayToList(T[] a) {
		Arrays.stream(a).forEach(System.out::println);
	}

	public <T extends MyGenericityContract> void fromWildcardExtending(T[] a) {
		Arrays.stream(a).forEach(x -> x.printData("DATA"));
	}
}
