package main;

import java.util.Arrays;
import java.util.Iterator;

public class MyMainApp {
	public static void main(String[] args) {
		Iterator<String> iterator = Arrays.stream(args).iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
