package advanced_concepts.recursivity.services;

public class MyRecursivityService {
	public int fibonacci(int n) {
		if (n <= 1) {
			return 1;
		}
		int x = fibonacci(n - 1);
		int y = fibonacci(n - 2);

		return x + y;
	}

	public int calculateSum(int n) {
		System.out.println(n);
		if (n == 1) {
			return 1;
		} else {
			return n + calculateSum(n - 1);
		}
	}
}
