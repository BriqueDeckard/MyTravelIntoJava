package java_fundamentals.core_classes.string.string_manipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class MyStringTokenizerApp {
	private String hello;

	public static void main(String[] args) {
		String message = "Barbara boira bien sa biere beurrée";
		System.out.println(getTokens(message));
		System.out.println(getTokensWithCollection(message));
		StringTokenizer stringTokenizer = new StringTokenizer(message, "b");
		while (stringTokenizer.hasMoreElements()) {
			System.out.println(stringTokenizer.nextToken("o"));
		}

	}

	static List<String> getTokensWithCollection(String s) {

		return Collections.list(new StringTokenizer(s, "b", true))
				.stream()
				.map(Object::toString)
				.toList();
	}

	static List<String> getTokens(String s) {
		List<String> tokens = new ArrayList<>();
		StringTokenizer tokenizer = new StringTokenizer(s, "b");
		while (tokenizer.hasMoreElements()) {
			tokens.add(tokenizer.nextToken());
		}
		return tokens;
	}
}
