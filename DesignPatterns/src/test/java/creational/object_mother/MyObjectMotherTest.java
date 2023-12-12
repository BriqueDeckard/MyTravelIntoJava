package creational.object_mother;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyObjectMotherTest {

	MyDomainEntityImpA myDomainEntityImpAType1A, myDomainEntityImpAType2B;

	@BeforeEach
	void setUp() {
		myDomainEntityImpAType1A = MyDomainEntityImpAMother.createMyDomainEntityImpAType1A();
		myDomainEntityImpAType2B = MyDomainEntityImpAMother.createMyDomainEntityImpAType2B();
	}

	@Test
	void testMyDomainEntityImpAType1AHasBeenBuiltCorrectly() {
		assertNotNull(myDomainEntityImpAType1A);
		assertAll(
				() -> assertEquals("Type", myDomainEntityImpAType1A.getFieldA()),
				() -> assertEquals("1", myDomainEntityImpAType1A.getFieldB()),
				() -> assertEquals("A", myDomainEntityImpAType1A.getFieldC())
		);
	}

	@Test
	void testMyDomainEntityImpAType2BHasBeenBuiltCorrectly() {
		assertNotNull(myDomainEntityImpAType2B);
		assertAll(
				() -> assertEquals("Type", myDomainEntityImpAType2B.getFieldA()),
				() -> assertEquals("2", myDomainEntityImpAType2B.getFieldB()),
				() -> assertEquals("B", myDomainEntityImpAType2B.getFieldC())
		);
	}

	private static class MyDomainEntityImpAMother {
		private static MyDomainEntityImpA createMyDomainEntityImpAType1A() {
			return new MyDomainEntityImpA("Type", "1", "A");
		}

		private static MyDomainEntityImpA createMyDomainEntityImpAType2B() {
			return new MyDomainEntityImpA("Type", "2", "B");
		}
	}

}