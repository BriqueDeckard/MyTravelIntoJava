package structural.composite_entity;

import java.util.Arrays;
import java.util.stream.IntStream;

public abstract class MyCoarseGrainedObject<T> {
	MyDependentObject<T>[] dependentObjects;

	public void setData(T... data) {
		IntStream.range(0, data.length).forEach(i -> dependentObjects[i].setData(data[i]));
	}

	public T[] getData(){
		return (T[]) Arrays.stream(dependentObjects).map(MyDependentObject::getData).toArray();
	}
}
