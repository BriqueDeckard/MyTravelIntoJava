package associated_frameworks.vavr;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import io.vavr.control.Option;
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
	public void getOption(){

		Option<String> optionNull = MyVavrApp.getOption(null);
		optionNull.onEmpty(() -> LOGGER.trace("Absent"));
		Option<String> bonjour = MyVavrApp.getOption("Bonjour");
		bonjour.onEmpty(() -> LOGGER.trace("Empty"));


	}
}