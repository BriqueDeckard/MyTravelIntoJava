package services.contracts;

import static org.junit.jupiter.api.Assertions.*;

import com.google.inject.Guice;
import com.google.inject.Injector;
import infra.MyGuiceModule;
import infra.ReplaceCamelCase;
import infra.TestLoggerExtension;

import java.util.stream.Stream;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junitpioneer.jupiter.cartesian.CartesianTest;

@DisplayNameGeneration(ReplaceCamelCase.class)
@ExtendWith(TestLoggerExtension.class)
class MyServiceTest {

    private static MyService myService;

    @BeforeAll
    static void initialize() {
        Injector injector = Guice.createInjector(new MyGuiceModule());
        myService = injector.getInstance(MyService.class);
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Nested
    class ModifyString {

        @TestFactory
        Stream<DynamicTest> dynamicTestModifyStringOK() {
            return Stream.of(
                    DynamicTest.dynamicTest("Cas 1 : OK", () -> {
                        String str = "Hello";
                        assertEquals("#Hello#", myService.modifyString(str));
                    })
            );
        }

        @Test
        void modifyStringOk() {
            // GIVEN
            final String ACTUAL_INPUT = "Iaculisplacerat";
            final String EXPECTED_OUTPUT = "#Iaculisplacerat#";
            // WHEN
            final String ACTUAL_OUTPUT = myService.modifyString(ACTUAL_INPUT);
            // THEN
            assertEquals(EXPECTED_OUTPUT, ACTUAL_OUTPUT);
        }

        @Test
        void modifyStringKoNullPointerException() {
            // GIVEN
            final String ACTUAL_INPUT = null;
            assertNull(ACTUAL_INPUT);
            // WHEN
            NullPointerException nullPointerException = Assertions.assertThrows(NullPointerException.class, () -> myService.modifyString(ACTUAL_INPUT));
            // THEN
            assertNotNull(nullPointerException);
            assertTrue(nullPointerException instanceof NullPointerException);
        }

        @CartesianTest
        void myCartesianTest(
                @CartesianTest.Values(booleans = { true, false}) boolean b1,
                @CartesianTest.Values(booleans = { true, false}) boolean b2
        ){
            assertEquals(true, b1&&b2);
        }
    }

    @Nested
    class CalculateSomething {
        /**
         * TODO: Javadoc
         */
        @Test
        void calculateSomethingOk() {
            // GIVEN
            final int ACTUAL_INPUT = 10;
            final int EXPECTED_OUTPUT = 89;
            // WHEN
            final int ACTUAL_OUTPUT = myService.calculateSomething(ACTUAL_INPUT);
            // THEN
            assertEquals(EXPECTED_OUTPUT, ACTUAL_OUTPUT);
        }

        @ParameterizedTest()
        @CsvSource({
                "1,1",
                "2, 2",
                "3, 3",
                "4, 5",
                "5, 8",
                "6, 13",
                "7, 21",
                "8, 34",
                "9, 55",
                "10, 89",
        })
        void calculateSomethingCsvSourceOk(Integer input, Integer expected) {
            // GIVEN
            assertNotNull(input);
            assertNotNull(expected);
            final int ACTUAL_INPUT = input;
            final int EXPECTED_OUTPUT = expected;
            // WHEN
            final int ACTUAL_OUTPUT = myService.calculateSomething(ACTUAL_INPUT);
            // THEN
            assertEquals(EXPECTED_OUTPUT, ACTUAL_OUTPUT);
        }

        @ParameterizedTest(name = "Test #{index}: {0} -> {1}")
        @MethodSource("calculateSomethingDataProvider")
        void calculateSomethingMethodSourceOk(final Integer INPUT, final Integer EXPECTED) {
            // GIVEN-WHEN
            assertNotNull(INPUT);
            assertNotNull(EXPECTED);
            final int ACTUAL_OUTPUT = myService.calculateSomething(INPUT);
            // THEN
            assertEquals(EXPECTED, ACTUAL_OUTPUT);
        }


        private static Stream<Arguments> calculateSomethingDataProvider() {
            return Stream.of(
                    Arguments.of(1, 1),
                    Arguments.of(2, 2),
                    Arguments.of(3, 3),
                    Arguments.of(4, 5)
            );
        }
    }
}