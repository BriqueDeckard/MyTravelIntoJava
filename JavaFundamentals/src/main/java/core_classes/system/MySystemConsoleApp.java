package core_classes.system;

import java.io.Console;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MySystemConsoleApp {
	public static void main(String[] args) {
		Properties properties = System.getProperties();
		Set<Map.Entry<Object, Object>> props = properties.entrySet();

		final List<String> keys = props.stream()
				.map(x -> x.getKey().toString())
				.filter(x -> !x.isEmpty())
				.sorted().toList();
		keys.forEach(x -> {
			String message = String.format("%1s gives %2s", x, System.getProperty(x));
			System.out.println(message);
		});

	}

	private static void myConsole() {
		String value = readFromConsole();
		System.out.println(value);
	}

	private static String readFromConsole() {
		Console console = System.console();
		return console == null ? null : console.readLine();
	}
}
