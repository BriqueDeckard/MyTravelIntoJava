package creational.step_builder;

public class MyStepBuilderApp {
	public static void main(String[] args) {
		MyDomainEntity myDomainEntity = new MyDomainEntity.Builder()
				.setName("NAME")
				.setPrice(12D)
				.setQuantity(21)
				.build();
		System.out.println(myDomainEntity);
	}
}
