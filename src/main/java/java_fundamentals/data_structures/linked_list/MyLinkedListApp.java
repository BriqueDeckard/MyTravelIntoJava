package java_fundamentals.data_structures.linked_list;

import java.util.LinkedList;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class MyLinkedListApp {
	public static void main(String[] args) {
		// Initializing
		LinkedList<String> myLinkedList1 = new LinkedList<>();
		// adding
		myLinkedList1.add("Hello");
		myLinkedList1.add("World");
		// Retrieve the first element
		LinkedList<String> myLinkedList2 = new LinkedList<>();
		try {
			System.out.println(myLinkedList2.poll()); // Return null on empty list
		} catch (Exception e) {
			System.out.println("Exc: " + e);
		}
		try {
			System.out.println(myLinkedList2.pop()); // Throws an exception
		} catch (Exception e) {
			System.out.println("Exc: " + e);
		}
		// Ad element at top
		myLinkedList1.push("Yop !");


	}
}
