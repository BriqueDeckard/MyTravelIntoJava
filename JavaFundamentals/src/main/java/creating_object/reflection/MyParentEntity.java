package creating_object.reflection;

public class MyParentEntity {
	private String name;
	private MyEntity child;

	public MyParentEntity(String name, MyEntity child) {
		this.name = name;
		this.child = child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyEntity getChild() {
		return child;
	}

	public void setChild(MyEntity child) {
		this.child = child;
	}

	@Override
	public String toString() {
		return "MyParentEntity{" +
				"name='" + name + '\'' +
				", child=" + child +
				'}';
	}
}
