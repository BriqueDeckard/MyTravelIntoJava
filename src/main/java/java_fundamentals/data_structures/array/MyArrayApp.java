package java_fundamentals.data_structures.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyArrayApp {
	public static void main(String[] args) {

		// Declaration
		int[] myIntArray1;
		Integer[] myIntArray2;

		// Initialization
		myIntArray1 = new int[] { 1, 2, 3, 4, 5, 6 };
		myIntArray2 = new Integer[] { 1, 2, 3, 4, 5, 6 };
		IntStream myIntArray3 = Arrays.stream(myIntArray1);

		// Access
		System.out.println(myIntArray1[1]);
		System.out.println(myIntArray2[1]);

		// Set
		myIntArray1[5] = 42;
		System.out.println(myIntArray1[5]);

		// Iterating
		for (Integer integer : myIntArray2) {
			System.out.println(integer);
		}
		for (int element : myIntArray2) {
			System.out.println(element);
		}

		// Varargs
		varargsMethod(myIntArray1, myIntArray1);

		// Array to list
		List<Integer> aList = Arrays.asList(myIntArray2);
		final List<Integer> list = Arrays.stream(myIntArray2).toList();

		// Copy
		int[] myArrayCopy1 = Arrays.copyOfRange(myIntArray1, 1, 3);

		// To string
		System.out.println(Arrays.toString(myArrayCopy1));
		StringBuilder stringBuilder = new StringBuilder();
		for (int j : myArrayCopy1) {
			stringBuilder.append(j);
		}
		System.out.println(stringBuilder);

		System.out.println(Arrays.stream(myIntArray1).boxed().map(Object::toString).collect(Collectors.joining(" ")));
		// Comparing
		int[] myArrayCopy2 = myArrayCopy1.clone();
		System.out.println(Arrays.equals(myArrayCopy2, myArrayCopy1));

		Object[] myObjectArray1 = new Object[] { "AA", 1, "BB" };
		Object[] myObjectArray2 = new Object[] { "AA", 1, "BB" };
		System.out.println(Arrays.deepEquals(myObjectArray1, myObjectArray2));
		System.out.println(Arrays.equals(myObjectArray1, myObjectArray2));

		// Sorting and searching
		String[] myStringArray1 = new String[] { "vert", "bleu", "rose", "BLEU" };
		final String[] mySTringArrayCopy = Arrays.copyOf(myStringArray1, 4);
		System.out.println(String.join(",", mySTringArrayCopy));
		Arrays.sort(mySTringArrayCopy);
		System.out.println(String.join(",", mySTringArrayCopy));

		// Binary search
		System.out.println("exact for BLEU: " + Arrays.binarySearch(mySTringArrayCopy, "BLEU"));
		System.out.println("Case insensitive: " + Arrays.binarySearch(mySTringArrayCopy, "bleu",
				String::compareToIgnoreCase));
	}

	public static void varargsMethod(int[]... varargs) {
		for (int[] element : varargs) {
			System.out.println(Arrays.toString(element));
		}
	}
}
