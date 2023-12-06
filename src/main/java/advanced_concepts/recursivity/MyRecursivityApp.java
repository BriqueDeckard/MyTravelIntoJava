package advanced_concepts.recursivity;

import advanced_concepts.recursivity.di.DaggerMyRecursivityComponent;
import advanced_concepts.recursivity.di.MyRecursivityComponent;
import advanced_concepts.recursivity.domain.User;
import advanced_concepts.recursivity.services.MyRecursivityService;
import advanced_concepts.recursivity.services.MyUserService;

public class MyRecursivityApp {
	private static MyRecursivityService myRecursivityService;
	private static MyUserService myUserService;

	public static void main(String[] args) {
		initialize();

		int n = 5;
		int sum = myRecursivityService.calculateSum(n);
		int f = myRecursivityService.fibonacci(n);
		System.out.println(sum);

		User user = new User("Pierre", 10);
		User user1 = new User("Gerard", 1, user);
		User user2 = new User("Marcel", 2, user1);
		System.out.println(myUserService.findUserWithName("Gerard", user1));

	}

	private static void initialize() {
		MyRecursivityComponent myRecursivityComponent = DaggerMyRecursivityComponent.create();
		myRecursivityService = myRecursivityComponent.buildRecursivityService();
		myUserService = myRecursivityComponent.buildUserService();
	}
}
