package core_classes.enums;

import java.util.ArrayList;
import java.util.EnumSet;
import java_fundamentals.core_classes.enums.example.Pizza;
import java_fundamentals.core_classes.enums.example.PizzaDeliverySystemConfiguration;

public class MyEnumApp {
	@SuppressWarnings("CommentedOutCode")
	public static void main(String[] args) {
//		myEnumSetUse();
//		mySimpleEnumUse();
//		myCustomEnumUse();
//		pizzaExample();
		MyEnumUser.MyEnum.stream().forEach(System.out::println);
		MyEnumUser.MyCustomEnum.stream().forEach(e -> System.out.println(e.name()));

	}

	private static void pizzaExample() {
		Pizza pizza1 = new Pizza();
		pizza1.setStatus(Pizza.PizzaStatus.ORDERED);
		pizza1.printTimeToDeliver();
		System.out.println(pizza1.isDeliverable());
		Pizza pizza2 = new Pizza();
		pizza2.setStatus(Pizza.PizzaStatus.READY);
		pizza2.printTimeToDeliver();
		System.out.println(pizza2.isDeliverable());
		Pizza pizza3 = new Pizza();
		pizza3.setStatus(Pizza.PizzaStatus.DELIVERED);
		pizza3.printTimeToDeliver();
		System.out.println(pizza3.isDeliverable());
		Pizza pizza4 = new Pizza();
		pizza4.setStatus(Pizza.PizzaStatus.READY);
		pizza4.printTimeToDeliver();
		System.out.println(pizza4.isDeliverable());

		PizzaDeliverySystemConfiguration.setDeliveryStrategy(PizzaDeliverySystemConfiguration.DeliveryStrategy.DELIVERING);
		ArrayList<Pizza> pizzaList = new ArrayList<>();
		pizzaList.add(pizza1);
		pizzaList.add(pizza2);
		pizzaList.add(pizza3);

		System.out.println(Pizza.getAllUndeliveredPizzas(pizzaList));
		for (Pizza p : pizzaList) {
			p.deliver();
		}
		System.out.println("Change to " + PizzaDeliverySystemConfiguration.DeliveryStrategy.PAUSE);
		PizzaDeliverySystemConfiguration.setDeliveryStrategy(PizzaDeliverySystemConfiguration.DeliveryStrategy.PAUSE);
		pizzaList.add(pizza4);
		for (Pizza p : pizzaList) {
			p.deliver();
		}
	}

	private static void myEnumSetUse() {
		EnumSet<MyEnumUser.MyCustomEnum> myCustomEnumValues =
				EnumSet.of(MyEnumUser.MyCustomEnum.MY_FIRST_CUSTOM_VALUE,
						MyEnumUser.MyCustomEnum.MY_SECOND_CUSTOM_VALUE);
		if (myCustomEnumValues.contains(MyEnumUser.MyCustomEnum.MY_FIRST_CUSTOM_VALUE)) {
			System.out.println(MyEnumUser.MyCustomEnum.MY_FIRST_CUSTOM_VALUE.myFirstCustomCheck());
		}
	}

	private static void myCustomEnumUse() {
		MyEnumUser myEnumUser = new MyEnumUser();
		System.out.println(myEnumUser.myCustomEnumGetter());
		myEnumUser.setMyCustomEnum(MyEnumUser.MyCustomEnum.MY_SECOND_CUSTOM_VALUE);
		System.out.println(myEnumUser.myCustomEnumGetter());
	}

	private static void mySimpleEnumUse() {
		MyEnumUser myEnumUser = new MyEnumUser();
		System.out.println(myEnumUser.getMyEnumField());
		System.out.println(myEnumUser.myEnumCheck());
		myEnumUser.setMyEnumField(MyEnumUser.MyEnum.MY_SECOND_VALUE);
		System.out.println(myEnumUser.getMyEnumField());
		System.out.println(myEnumUser.myEnumCheck());
		myEnumUser.setMyEnumField(MyEnumUser.MyEnum.MY_THIRD_VALUE);
		System.out.println(myEnumUser.getMyEnumField());
		System.out.println(myEnumUser.myEnumCheck());
	}
}
