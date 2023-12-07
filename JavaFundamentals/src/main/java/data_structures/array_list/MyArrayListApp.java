package data_structures.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MyArrayListApp {
	public static void main(String[] args) {
		// Initialize
		List<String> myArrayList1 = new ArrayList<>();
		//noinspection ConstantValue
		System.out.println(myArrayList1.isEmpty());
		myArrayList1.add("Hello");
		myArrayList1.add("Hola");
		myArrayList1.add("Bonjour");
		System.out.println(String.join(", ", myArrayList1));

		// Browse
		ListIterator<String> istIt = myArrayList1.listIterator(myArrayList1.size());
		ArrayList<String> result = new ArrayList<>(myArrayList1.size());
		while (istIt.hasPrevious()) {
			result.add(istIt.previous());
		}

		// Reverse
		Collections.reverse(myArrayList1);
		System.out.println(result.indexOf("Hello"));
		System.out.println(result.lastIndexOf("Hello"));
		// Copy
		ArrayList<String> myArrayList2 = new ArrayList<>(myArrayList1);
		// Sort
		Collections.sort(myArrayList2);
		System.out.println(String.join(",", myArrayList2));
		// Search once sorted
		int index = Collections.binarySearch(myArrayList2, "Hola");
		System.out.println(index);
		// Remove Element
		myArrayList2.remove(index);
		System.out.println(String.join(", ", myArrayList2));


	}
}
