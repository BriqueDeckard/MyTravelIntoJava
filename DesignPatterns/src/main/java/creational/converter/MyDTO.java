package creational.converter;

public class MyDTO {
	private int id;
	private String name;

	public MyDTO(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyDTO{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
