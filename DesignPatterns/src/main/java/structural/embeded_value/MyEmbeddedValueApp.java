package structural.embeded_value;

public class MyEmbeddedValueApp {
	public static void main(String[] args) throws Exception {
		MyOrder myOrder = new MyOrder("ITEM", "ORDERED_BY", new ShippingAddress("CITY", "STATE", "PINCODE"));
		MyOrderRepository myOrderRepository = new MyOrderRepository();
		myOrderRepository.insertOrder(myOrder);
	}
}
