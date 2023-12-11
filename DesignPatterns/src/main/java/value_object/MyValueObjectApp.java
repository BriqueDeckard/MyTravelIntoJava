package value_object;

public class MyValueObjectApp {
	public static void main(String[] args) {
		MyValueObject myValueObject1 = MyValueObject.of(10, 9, 8);
		MyValueObject myValueObject2 = MyValueObject.of(10, 9, 8);
		MyValueObject myValueObject3 = MyValueObject.of(10, 10, 8);

		System.out.println(myValueObject1.equals(myValueObject2));
		System.out.println(myValueObject1.equals(myValueObject3));
	}
}
