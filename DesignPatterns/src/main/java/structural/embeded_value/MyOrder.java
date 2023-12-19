package structural.embeded_value;

public class MyOrder {

	private int id;
	private String item;
	private String orderedBy;
	private ShippingAddress shippingAddress;

	public MyOrder(String item, String orderedBy, ShippingAddress shippingAddress) {
		this.item = item;
		this.orderedBy = orderedBy;
		this.shippingAddress = shippingAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
