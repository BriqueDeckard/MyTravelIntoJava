package associated_frameworks.dependency_injection.dagger;

public class Brand {
	private final String name;

	public Brand(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Brand{" +
				"name='" + name + '\'' +
				'}';
	}
}
