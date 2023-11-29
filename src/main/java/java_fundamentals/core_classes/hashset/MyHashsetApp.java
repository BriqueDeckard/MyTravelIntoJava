package java_fundamentals.core_classes.hashset;

import java.util.HashSet;
import java.util.Set;

public class MyHashsetApp {
	@SuppressWarnings("ConstantValue")
	public static void main(String[] args) {
		Set<String> myHashset1 = new HashSet<>();
		String quaranteDeux = "42";
		// Add --> not present
		System.out.println(myHashset1.add(quaranteDeux) ? "Was added" : "Was not added");
		// Add --> Already present
		System.out.println(myHashset1.add(quaranteDeux) ? "Was added" : "Was not added");
		// Contains
		String belette = "belette";
		System.out.println(myHashset1.contains(quaranteDeux) ? "Contains" : "Not contains");
		System.out.println(myHashset1.contains(belette) ? "Contains" : "Not contains");
		// Remove
		System.out.println(myHashset1.remove(quaranteDeux) ? "Was removed" : "Not removed");
		System.out.println(myHashset1.remove(quaranteDeux) ? "Was removed" : "Not removed");
		System.out.println(quaranteDeux.hashCode());
		System.out.println(belette.hashCode());

	}
}
