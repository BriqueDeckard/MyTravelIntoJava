package regex_api;

import io.vavr.control.Option;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegexApiApp {
	public static void main(String[] args) {
		// Simple match : a literal String
		String lorem = "16 1Fermentumviverra 19 2 Elitmassa 19 17 3Risustempor 49 27 4 Elitmassa 46 37 5";
		Set<Pattern> setOfPattern = Set.of(
				Pattern.compile("Elitmassa"),
				Pattern.compile("Fermentumviverra"),
				Pattern.compile("Risustempor"),
				Pattern.compile("Serlino"),
				Pattern.compile("."),
				Pattern.compile("Elitmassa ."),
				Pattern.compile("[fermntuv]"),
				Pattern.compile("[a-zA-Z]"),
				Pattern.compile("[^a-z]"),
				Pattern.compile("[^A-Z]"),
				Pattern.compile("[0-9]"),
				Pattern.compile("[^0-9]"),
				Pattern.compile("[0-3]7"),
				Pattern.compile("[[0-3]7-9]"),
				// Digits
				Pattern.compile("\\d"),
				// Non-digits
				Pattern.compile("\\D"),
				// White space
				Pattern.compile("\\s"),
				// Non white space
				Pattern.compile("\\S"),
				// Word
				Pattern.compile("\\w"),
				// Non word
				Pattern.compile("\\W"),
				// Zero or one time
				Pattern.compile("\\d?"),
				// zero or limitless
				Pattern.compile("\\d*"),
				Pattern.compile("\\D*")
		);
		setOfPattern.forEach(pattern -> {
			Matcher matcher = pattern.matcher(lorem);
			String actualPattern = Option.of(pattern.pattern()).getOrElse("Pattern");
			boolean find = Option.of(matcher.find()).getOrElse(false);
			String group = find ? matcher.group() : "Not found";
			int end = find ? matcher.end() : -1;
			int groupCount = matcher.groupCount();
			boolean hasAnchoringBounds = matcher.hasAnchoringBounds();
			boolean matches = matcher.matches();
			int matchesCount = 0;
			while (matcher.find()){
				matchesCount++;
			}

			System.out.println(
					"Pattern: " + actualPattern +
							" - Find: " + find +
							" - Group: " + group +
							" - End: " + end +
							" - groupCount: " + groupCount +
							" - hasAnchoringBounds: " + hasAnchoringBounds +
							" - matches: " + matches +
							" - matchesCount: " + matchesCount
			);
		});


	}
}
