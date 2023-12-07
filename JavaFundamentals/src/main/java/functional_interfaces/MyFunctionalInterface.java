package functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MyFunctionalInterface {
	public static void main(String[] args) {
		Function<Double, String> stringer = Object::toString;
		Function<String, String> quoter = s -> "'"+s+"'";
		Function<Double, String> stringerQuoter = quoter.compose(stringer);

		Map<String, Integer> mapper = new HashMap<>();
		for (double i = 0D; i <= 10; i++) {
			mapper.computeIfAbsent(stringerQuoter.apply(i), String::length);
		}
		mapper.forEach((key, value) -> System.out.println(key + " - " + value));

		for (double i = 0D; i <= 10; i++) {
			mapper.computeIfAbsent(stringerQuoter.apply(i), String::length);
		}
		mapper.forEach((key, value) -> System.out.println(key + " - " + value));
	}
}
