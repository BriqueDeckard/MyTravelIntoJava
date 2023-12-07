package vavr;

import static org.junit.jupiter.api.Assertions.*;

import associated_frameworks.extension.vavr.MyVavrApp;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.control.Option;
import io.vavr.control.Try;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class MyVavrAppTest {
	static final Logger LOGGER = LogManager.getLogger(MyVavrAppTest.class);

	@Test
	public void givenValue_tradiNullCheck() {
		Object possibleNull = null;
		if (possibleNull == null) {
			possibleNull = "Default";
		}
		assertNotNull(possibleNull);
	}

	@Test
	public void givenValue_optionNullCheck() {
		Option<Object> noneOption = Option.of(null);
		Option<Object> someOption = Option.of("42");
		assertEquals("None", noneOption.toString());
		assertEquals("Some(42)", someOption.toString());
	}

	@Test
	public void givenValue_optionGetOrElse() {
		Option<Object> noneOption = Option.of(null);
		assertEquals("Hello", noneOption.getOrElse("Hello"));
	}

	@Test
	public void getOption() {
		Option<String> optionNull = MyVavrApp.getOption(null);
		optionNull.onEmpty(() -> LOGGER.trace("Absent"));
		Option<String> bonjour = MyVavrApp.getOption("Bonjour");
		bonjour.onEmpty(() -> LOGGER.trace("Empty"));
	}

	@Test
	public void tupleThings() {
		Tuple2<String, Integer> java8 = Tuple.of("Java", 8);
		String element1 = java8._1;
		Integer element2 = java8._2;
		assertAll(
				() -> assertEquals("Java", element1),
				() -> assertEquals(8, element2)
		);
	}

	@Test
	void tryThing(){
		Try<Integer> result = Try.of(() -> 1 / 0);
		assertTrue(result.isFailure());
		Integer errorSentinel = result.getOrElse(-1);
		assertEquals(-1, errorSentinel);
		ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, () -> result.getOrElseThrow(() -> new ArithmeticException()));

	}
}