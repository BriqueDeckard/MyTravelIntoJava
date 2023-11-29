package java_fundamentals.cast;

public class MyCastApp {
	public static void main(String[] args) {

		Animal animal = new Animal("Yoyo");
		Class<? extends Animal> animalType = animal.getClass();
		Object o = new Animal("Yaya");
		//noinspection ConstantValue
		System.out.println(animalType.isInstance(o) ? animalType.cast(o).getName() : "Pilou");

	}

	static class Animal {
		private String name;

		public Animal(String name) {
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
			return "Animal{" +
					"name='" + name + '\'' +
					'}';
		}
	}
}
