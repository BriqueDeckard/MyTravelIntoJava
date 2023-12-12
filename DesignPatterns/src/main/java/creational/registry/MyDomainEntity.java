package creational.registry;

public class MyDomainEntity {
	private final String id;
	private final String name;

	public MyDomainEntity(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "MyDomainEntity{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
