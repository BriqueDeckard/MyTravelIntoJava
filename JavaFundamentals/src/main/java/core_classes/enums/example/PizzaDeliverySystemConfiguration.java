package core_classes.enums.example;

public class PizzaDeliverySystemConfiguration {
	private static PizzaDeliverySystemConfiguration instance;

	private static DeliveryStrategy deliveryStrategy;

	public static PizzaDeliverySystemConfiguration getInstance() {
		instance = instance == null ? new PizzaDeliverySystemConfiguration() : instance;
		return instance;
	}

	public DeliveryStrategy getDeliveryStrategy() {
		return deliveryStrategy;
	}

	public static void setDeliveryStrategy(DeliveryStrategy _deliveryStrategy) {
		deliveryStrategy = _deliveryStrategy;
	}

	public enum DeliveryStrategy {
		DELIVERING() {
			@Override
			public boolean deliver(Pizza pizza) {
				System.out.println("Delivering : " + pizza.toString());
				return true;
			}
		},
		PAUSE() {
			@Override
			public boolean deliver(Pizza pizza) {
				System.out.println("Not delivering : " + pizza.toString());
				return false;
			}
		};

		public boolean deliver(Pizza pizza) {
			System.out.println("Not deliver : " + pizza.toString());
			return false;
		}
	}
}
