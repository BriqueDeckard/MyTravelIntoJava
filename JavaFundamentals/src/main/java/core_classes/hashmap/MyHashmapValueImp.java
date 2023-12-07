package core_classes.hashmap;

public class MyHashmapValueImp {
	String name;

	public MyHashmapValueImp(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyHashmapChildImp{" +
				"name='" + name + '\'' +
				'}';
	}
}
