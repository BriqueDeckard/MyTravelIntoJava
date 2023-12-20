package infra;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayNameGenerator;

public class ReplaceCamelCase extends DisplayNameGenerator.Standard {
	@Override
	public String generateDisplayNameForClass(Class<?> testClass) {
		return replaceCamelCase(super.generateDisplayNameForClass(testClass));
	}

	@Override
	public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
		return replaceCamelCase(super.generateDisplayNameForNestedClass(nestedClass));
	}

	@Override
	public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
		return replaceCamelCase(super.generateDisplayNameForMethod(testClass, testMethod));
	}

	public String replaceCamelCase(String camelCase) {
		String replaced = camelCase.replaceAll("([(])|([)])", "")
				.replaceAll("\\s[kK][oO]", " - KO")
				.replaceAll("\\s[oO][kK]", " - OK");

		StringBuilder result = new StringBuilder();
		result.append(Character.toUpperCase(replaced.charAt(0)));
		for (int i = 1; i < replaced.length(); i++) {
			if (Character.isUpperCase(replaced.charAt(i))) {
				result.append(' ');
				result.append(Character.toLowerCase(replaced.charAt(i)));
			} else {
				result.append(replaced.charAt(i));
			}
		}
		return result.toString();
	}

	String replaceCamelCaseV1(String camelCase) {
		StringBuilder result = new StringBuilder();
		result.append(Character.toUpperCase(camelCase.charAt(0)));
		for (int i = 1; i < camelCase.length(); i++) {
			if (Character.isUpperCase(camelCase.charAt(i))) {
				result.append(' ');
				result.append(Character.toLowerCase(camelCase.charAt(i)));
			} else {
				result.append(camelCase.charAt(i));
			}
		}
		String string = result.toString();
		return replaceParenthesis(replaceOk(replaceKo(string)));
	}

	private static String replaceParenthesis(String input) {
		String find = "[(][)]";
		String replace = "";
		Pattern pattern = Pattern.compile(find);
		Matcher matcher = pattern.matcher(input);
		return matcher.replaceAll(replace);
	}

	private static String replaceKo(String input) {
		String find = "\s[k|K][o|O]";
		String replace = " - KO";
		Pattern pattern = Pattern.compile(find);
		Matcher matcher = pattern.matcher(input);
		return matcher.replaceAll(replace);
	}

	private static String replaceOk(String input) {
		String find = "\s[o|O][k|K]";
		String replace = " - OK";
		Pattern pattern = Pattern.compile(find);
		Matcher matcher = pattern.matcher(input);
		return matcher.replaceAll(replace);
	}

}
