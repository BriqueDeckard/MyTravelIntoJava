package recursivity.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyRecursivityServiceTest {


	/**
	 * TODO: Javadoc
	 */
	@Test
	void fibonacci_1() {
		// GIVEN
		int inputNumber = 1;
		int expected = 1;
		// WHEN
		int result = MyRecursivityService.fibonacci(inputNumber);
		// THEN
		assertEquals(expected, result);
	}

	@Test
	void fibonnaci_2() {
		// GIVEN
		int inputNumber = 2;
		int expected = 2;
		// WHEN
		int result = MyRecursivityService.fibonacci(inputNumber);
		// THEN
		assertEquals(expected, result);
	}

	@Test
	void fibonnaci_3() {
		// GIVEN
		int inputNumber = 3;
		int expected = 3;
		// WHEN
		int result = MyRecursivityService.fibonacci(inputNumber);
		// THEN
		assertEquals(expected, result);
	}

	@Test
	void fibonnaci_4() {
		// GIVEN
		int inputNumber = 4;
		int expected = 5;
		// WHEN
		int result = MyRecursivityService.fibonacci(inputNumber);
		// THEN
		assertEquals(expected, result);
	}

	/**
	 * TODO: Javadoc
	 */
	@Test
	void calculateSum() {
		// GIVEN
		int inputNumber = 4;
		int expected = 10;
		// WHEN
		int result = MyRecursivityService.calculateSum(inputNumber);
		// THEN
		assertEquals(expected, result);
	}
}