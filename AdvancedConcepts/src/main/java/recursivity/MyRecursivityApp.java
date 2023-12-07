package recursivity;

import recursivity.domain.User;
import recursivity.services.MyRecursivityService;
import recursivity.services.MyUserService;

public class MyRecursivityApp {

	public static void main(String[] args) {
		int n = 5;
		int sum = MyRecursivityService.calculateSum(n);
		int f = MyRecursivityService.fibonacci(n);
		System.out.println(sum);

		User user = new User("Pierre", 10);
		User user1 = new User("Gerard", 1, user);
		User user2 = new User("Marcel", 2, user1);
		System.out.println(MyUserService.findUserWithName("Gerard", user1));

	}
}
