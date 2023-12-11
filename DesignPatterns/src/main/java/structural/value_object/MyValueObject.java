package structural.value_object;

import java.util.Objects;
import lombok.Value;

// @Value : Generates a lot of code which fits with a class that is a representation of an immutable entity.
// staticConstructor : If you specify a static constructor name, then the generated constructor will be private, and
// instead a static
// factory method is created that other classes can use to create instances.
@Value
public class MyValueObject {
	private final int fieldA;
	private final int fieldB;
	private final int fieldC;

	private MyValueObject(Integer fieldA, Integer fieldB, Integer fieldC) {
		this.fieldA = fieldA;
		this.fieldB = fieldB;
		this.fieldC = fieldC;
	}

	static MyValueObject of(Integer a, Integer b, Integer c) {
		Objects.requireNonNull(a, "A must not be null");
		Objects.requireNonNull(b, "B must not be null");
		Objects.requireNonNull(c, "C must not be null");
		return new MyValueObject(a, b, c);
	}
}
