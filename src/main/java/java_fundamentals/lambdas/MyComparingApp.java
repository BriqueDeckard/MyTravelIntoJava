package java_fundamentals.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparingApp {
	public static void main(String[] args) {
		List<Human> humans = Arrays.asList(
				new Human("Sarah", 10),
				new Human("Jack", 12),
				new Human("Jack", 9)
		);
		List<Human> sorted = humans.stream()
				.sorted(
						Comparator
								.comparing(Human::getName)
								.thenComparing(Human::getAge)
				)
				.collect(Collectors.toList());
		System.out.println(sorted);
	}

	static class Human {
		public String name;
		public int age;

		public Human(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Human{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}
}
