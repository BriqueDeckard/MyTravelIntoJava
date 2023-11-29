package java_fundamentals.recursivity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import advanced_concepts.recursivity.MyRecursivityApp;
import org.junit.jupiter.api.Test;

class MyRecursivityAppTest {

	/**
	 * TODO: Javadoc
	 */
	@Test
	void fibonacci_1() {
		// GIVEN
		int n = 1;
		// WHEN
		int fibonacci = MyRecursivityApp.fibonacci(n);
		// THEN
		assertEquals(1, fibonacci);
	}

	@Test
	void fibonnaci_2() {
		// GIVEN
		int n = 2;
		// WHEN
		int fibonnaci = MyRecursivityApp.fibonacci(n);
		// THEN
		assertEquals(2, fibonnaci);
	}

	@Test
	void fibonnaci_3() {
		// GIVEN
		int n = 3;
		// WHEN
		int fibonnaci = MyRecursivityApp.fibonacci(n);
		// THEN
		assertEquals(3, fibonnaci);
	}

	@Test
	void fibonnaci_4() {
		// GIVEN
		int n = 4;
		// WHEN
		int fibonnaci = MyRecursivityApp.fibonacci(n);
		// THEN
		assertEquals(5, fibonnaci);
	}
}