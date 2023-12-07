package core_classes.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class MyOptionalApp {
	@SuppressWarnings("OptionalOfNullableMisuse")
	public static void main(String[] args) {
		Optional<MyObject> optionalMyObject = Optional.ofNullable(new MyObject("OBJECT"));

		Predicate<MyObject> myPredicate = (x) -> x.name.equals("Belette");
		System.out.println(optionalMyObject.filter(myPredicate).isPresent());
	}

	static class MyObject {
		String name;

		public MyObject(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "MyObject{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}
