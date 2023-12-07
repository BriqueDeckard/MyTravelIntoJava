package recursivity.services;

public class MyRecursivityService {
	public static int fibonacci(int n) {
		if (n <= 1) {
			return 1;
		}
		int x = fibonacci(n - 1);
		int y = fibonacci(n - 2);

		return x + y;
	}

	public static int calculateSum(int limit) {
		if (limit == 1) {
			return 1;
		} else {
			return limit + calculateSum(limit - 1);
		}
	}
}
