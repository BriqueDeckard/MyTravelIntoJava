package design_patterns.lazy_initialization.example;

import java.util.function.Supplier;

public class LaziPi {
	private final Supplier<Double> calculator = () -> 3.14;
	private Double value;

	public synchronized Double getValue() {
		if (value == null) {
			value = calculator.get();
		}
		return value;
	}

	@Override
	public String toString() {
		return "LaziPi{" +
				"calculator=" + calculator +
				", value=" + value +
				'}';
	}
}
