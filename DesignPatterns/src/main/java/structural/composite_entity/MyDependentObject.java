package structural.composite_entity;

public abstract class MyDependentObject<T> {
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
