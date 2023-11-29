package java_fundamentals.core_classes.hashmap;

public class MyHashmapKeyImp {
	private int id;
	private String value;

	public MyHashmapKeyImp(int id, String value) {
		this.id = id;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MyHashmapKeyImp that = (MyHashmapKeyImp) o;

		if (id != that.id) return false;
		return value.equals(that.value);
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + value.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "MyHashmapKeyImp{" +
				"id=" + id +
				", value='" + value + '\'' +
				'}';
	}
}
