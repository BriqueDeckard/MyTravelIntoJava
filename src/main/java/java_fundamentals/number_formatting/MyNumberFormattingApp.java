package java_fundamentals.number_formatting;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyNumberFormattingApp {
	static final double value = 4.2352989244d;

	public static void main(String[] args) {
		stringFormat();
		bigDecimal();
	}

	private static void bigDecimal() {
		BigDecimal bigDecimal = new BigDecimal(value);
		bigDecimal = bigDecimal.setScale(4, RoundingMode.HALF_DOWN);
		System.out.println(bigDecimal.doubleValue());
	}

	private static void stringFormat() {
		for (int i = 0; i < 10; i++) {
			String pattern = "%." + i + "f";
			System.out.printf((pattern) + "%n", value);
		}
	}
}
