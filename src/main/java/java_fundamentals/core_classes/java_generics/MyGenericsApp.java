package java_fundamentals.core_classes.java_generics;

public class MyGenericsApp {
	public static void main(String[] args) {
		genericMethod();
	}

	private static void genericMethod() {
		Integer[] array1 = new Integer[] { 1, 2, 3 };
		new MyGenericMethodContainer().fromArrayToList(array1);
		String[] array2 = new String[] { "Allo", "maman", "bobo" };
		MyGenerecityImp[] myGenerecityImps = new MyGenerecityImp[] { new MyGenerecityImp() };
		new MyGenericMethodContainer().fromWildcardExtending(myGenerecityImps);
	}
}
