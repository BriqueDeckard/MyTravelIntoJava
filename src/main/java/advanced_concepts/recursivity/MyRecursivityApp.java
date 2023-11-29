package advanced_concepts.recursivity;

public class MyRecursivityApp {
	public static void main(String[] args) {
		int n = 5;
		int sum = calculateSum(n);
		int f = fibonacci(n);
		System.out.println(sum);


		User user = new User("Pierre", 10);
		User user1 = new User("Gerard", 1, user);
		User user2 = new User("Marcel", 2, user1);


		System.out.println(findUserWithName("Gerard", user1));

	}

	public static int fibonacci(int n) {
		if (n <= 1) {
			return 1;
		}
		int x = fibonacci(n - 1);
		int y = fibonacci(n - 2);

		return x + y;
	}

	private static int calculateSum(int n) {
		System.out.println(n);
		if (n == 1) {
			return 1;
		} else {
			return n + calculateSum(n - 1);
		}
	}

	private static User findUserWithName(String value, User user) {
		if (user == null) {
			return new User("Yop", 966);
		}
		if (user.name.equals(value)) {
			return user;
		}
		User neighbor = user.neighbor;
		return findUserWithName(value, neighbor);
	}

	static class User {
		private String name;
		private Integer value;

		private User neighbor;

		public User(String name, Integer value, User neighbor) {
			this.name = name;
			this.value = value;
			this.neighbor = neighbor;
		}

		public User(String name, Integer value) {
			this.name = name;
			this.value = value;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public User getNeighbor() {
			return neighbor;
		}

		public void setNeighbor(User neighbor) {
			this.neighbor = neighbor;
		}

		@Override
		public String toString() {
			return "User{" +
					"name='" + name + '\'' +
					", value=" + value +
					", neighbor=" + neighbor +
					'}';
		}
	}
}
