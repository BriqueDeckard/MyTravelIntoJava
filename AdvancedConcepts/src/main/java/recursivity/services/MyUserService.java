package recursivity.services;


import recursivity.domain.User;

public class MyUserService {

	public static User findUserWithName(String value, User user) {
		if (user == null) {
			return new User("Yop", 966);
		}
		if (user.getName().equals(value)) {
			return user;
		}
		User neighbor = user.getNeighbor();
		return findUserWithName(value, neighbor);
	}
}
