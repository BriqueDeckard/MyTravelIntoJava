package recursivity.domain;

public class User {
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