package core_classes.string.string_manipulation;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class MyStringJoinerApp {
	public static void main(String[] args) {
		legacyStringJoiner();
		List<String> wordList = Arrays.asList("Bonjour", "mon", "cher", "Alfred", ".");
		System.out.println(String.join(" ", wordList));
	}

	private static void legacyStringJoiner() {
		String prefix = "AA";
		String suffix = "BB";
		StringJoiner stringJoiner = new StringJoiner(",", prefix, suffix);
		stringJoiner.add("Deqard");
		stringJoiner.add("Mooch");
		System.out.println(stringJoiner);
	}

}
