package core_classes.enums.example;

import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {
	private static final EnumSet<PizzaStatus> undeliveredPizzaStatuses = EnumSet.of(PizzaStatus.ORDERED, PizzaStatus.READY);
	private PizzaStatus status;

	public static List<Pizza> getAllUndeliveredPizzas(List<Pizza> input) {
		return input.stream().filter(
				(pizza) -> undeliveredPizzaStatuses.contains(pizza.getStatus())
		).collect(Collectors.toList());
	}

	public PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(PizzaStatus status) {
		this.status = status;
	}

	public boolean isDeliverable() {
		return this.status.isReady();
	}

	public void printTimeToDeliver() {
		System.out.println("Time is : " + this.getStatus().getTimeToDelivery());
	}

	public void deliver() {
		if (isDeliverable()) {
			boolean delivered = PizzaDeliverySystemConfiguration.getInstance().getDeliveryStrategy().deliver(this);
			if (delivered) {
				this.setStatus(PizzaStatus.DELIVERED);
			}

		}
	}

	@Override
	public String toString() {
		return "Pizza{" +
				"status=" + status +
				'}';
	}

	public enum PizzaStatus {
		ORDERED(5) {
			@Override
			public boolean isOrdered() {
				return true;
			}
		},
		READY(2) {
			@Override
			public boolean isReady() {
				return true;
			}
		},
		DELIVERED(0) {
			@Override
			public boolean isDelivered() {
				return true;
			}
		};
		private final int timeToDelivery;

		PizzaStatus(int timeToDelivery) {
			this.timeToDelivery = timeToDelivery;
		}

		public boolean isOrdered() {
			return false;
		}

		public boolean isReady() {
			return false;
		}

		public boolean isDelivered() {
			return false;
		}

		public int getTimeToDelivery() {
			return timeToDelivery;
		}
	}
}
