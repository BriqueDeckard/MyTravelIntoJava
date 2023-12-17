package creational.step_builder;

public class MyDomainEntity {
	private String name;
	private Double price;
	private int quantity;

	public MyDomainEntity(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "MyDomainEntity{" +
				"name='" + name + '\'' +
				", price=" + price +
				", quantity=" + quantity +
				'}';
	}

	public static class Builder {
		private String name;
		private Double price;
		private int quantity;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setPrice(Double price) {
			this.price = price;
			return this;
		}

		public Builder setQuantity(int quantity) {
			this.quantity = quantity;
			return this;
		}

		public MyDomainEntity build() {
			return new MyDomainEntity(name, price, quantity);
		}
	}
}
