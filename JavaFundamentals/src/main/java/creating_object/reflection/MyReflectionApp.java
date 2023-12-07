package creating_object.reflection;

import java.lang.reflect.InvocationTargetException;

public class MyReflectionApp {
	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		MyEntity myEntity = MyEntity.class.getConstructor(String.class).newInstance("Donna");
		MyParentEntity myParentEntity =
				MyParentEntity.class.getConstructor(String.class, MyEntity.class).newInstance("Deqard", myEntity);
		System.out.println(myParentEntity);
	}
}
