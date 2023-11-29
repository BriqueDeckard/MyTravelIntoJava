package java_fundamentals.core_classes.string.string_manipulation;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("RedundantStringFormatCall")
public class MyStringManipulationApp {

	public static void main(String[] args) {
//		myDateExperiment();
		System.out.println(String.format("String %s", "hello"));
		System.out.println(String.format("STRING %S", "hello"));
		System.out.println(String.format("Boolean %b", true));
		System.out.println(String.format("BOOLEAN %B", true));
		System.out.println(String.format("integer %h", 1242));
		System.out.println(String.format("INTEGER %H", 1242));
		System.out.println(String.format("unicode %c", 230));
		System.out.println(String.format("UNICODE %C", 230));
		System.out.println(String.format("decimal %d", 230));
		System.out.println(String.format("octal %o", 230));
		System.out.println(String.format("hexa %x", 230));
		System.out.println(String.format("HEXA %X", 230));
		System.out.println(String.format("sci %e", 1.0));
		System.out.println(String.format("SCI %E", 1.0));
		System.out.println(String.format("decimal %f", 23.0));
		System.out.println(String.format("sci %g", 23.00000));
		System.out.println(String.format("sci %G", 23.00000));
		System.out.println(String.format("hex %a", 23.00000));
		System.out.println(String.format("HEX %A", 23.00000));
		System.out.println(String.format("HEX %% %A", 23.00000));
		System.out.println(String.format("HEX %n %A", 23.00000));
		System.out.println(String.format("HEX %n %1A %2A", 23.00000, 45.000));

	}

	private static void myDateExperiment() {
		Date date = new Date();

		Set<String> invalidCharacters = new HashSet<>();

		for (char c = 'a'; c <= 'z'; c++) {
			String character = "" + c;
			String message = character + " produce %t" + character;
			try {
				System.out.println(String.format(message, date));
			} catch (Exception e) {
				invalidCharacters.add(character);
			}
			character = character.toUpperCase();
			message = character + " produce %t" + character;
			try {
				System.out.println(String.format(message, date));
			} catch (Exception e) {
				invalidCharacters.add(character);
			}
		}
		System.out.println(invalidCharacters);
	}
}
