package java_fundamentals.recursivity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import advanced_concepts.recursivity.di.DaggerMyRecursivityComponent;
import advanced_concepts.recursivity.di.MyRecursivityComponent;
import advanced_concepts.recursivity.services.MyRecursivityService;
import advanced_concepts.recursivity.services.MyUserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MyRecursivityAppTest {

	private MyRecursivityService myRecursivityService;
	private MyUserService myUserService;

	@BeforeAll
	void beforeAll() {
		MyRecursivityComponent myRecursivityComponent = DaggerMyRecursivityComponent.create();
		myRecursivityService = myRecursivityComponent.buildRecursivityService();
		myUserService = myRecursivityComponent.buildUserService();
	}

	/**
	 * TODO: Javadoc
	 */
	@Test
	void fibonacci_1() {
		// GIVEN
		int n = 1;
		// WHEN
		int fibonacci = myRecursivityService.fibonacci(n);
		// THEN
		assertEquals(1, fibonacci);
	}

	@Test
	void fibonnaci_2() {
		// GIVEN
		int n = 2;
		// WHEN
		int fibonnaci = myRecursivityService.fibonacci(n);
		// THEN
		assertEquals(2, fibonnaci);
	}

	@Test
	void fibonnaci_3() {
		// GIVEN
		int n = 3;
		// WHEN
		int fibonnaci = myRecursivityService.fibonacci(n);
		// THEN
		assertEquals(3, fibonnaci);
	}

	@Test
	void fibonnaci_4() {
		// GIVEN
		int n = 4;
		// WHEN
		int fibonnaci = myRecursivityService.fibonacci(n);
		// THEN
		assertEquals(5, fibonnaci);
	}
}