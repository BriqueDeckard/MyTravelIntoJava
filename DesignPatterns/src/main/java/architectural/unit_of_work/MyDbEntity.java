package architectural.unit_of_work;

public class MyDbEntity {
	private Integer id;
	private String name;

	public MyDbEntity(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Pipou{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
