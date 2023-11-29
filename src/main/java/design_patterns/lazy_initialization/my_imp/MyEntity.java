package design_patterns.lazy_initialization.my_imp;

import java.util.function.Supplier;

public class MyEntity {
	private String name;

	private MyInternalObject myInternalObject;

	private final Supplier<MyInternalObject> internalSupplier = () -> new MyInternalObject(42);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyInternalObject getMyInternalObject() {
		if (myInternalObject == null) {
			myInternalObject = internalSupplier.get();
		}
		return myInternalObject;
	}

	public void setMyInternalObject(MyInternalObject myInternalObject) {
		this.myInternalObject = myInternalObject;
	}

	@Override
	public String toString() {
		return "MyEntity{" +
				"name='" + name + '\'' +
				", myInternalObject=" + myInternalObject +
				'}';
	}

	class MyInternalObject {
		private int number;

		public MyInternalObject(int number) {
			this.number = number;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		@Override
		public String toString() {
			return "MyInternalObject{" +
					"number=" + number +
					'}';
		}
	}
}
