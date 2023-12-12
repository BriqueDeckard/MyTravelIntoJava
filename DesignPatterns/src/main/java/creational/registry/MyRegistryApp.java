package creational.registry;

public class MyRegistryApp {
	public static void main(String[] args) {
		MyDomainEntityRegistry myRegistryContract = new MyDomainEntityRegistry();
		myRegistryContract.add(new MyDomainEntity("1", "Blue"));
		myRegistryContract.add(new MyDomainEntity("2", "Red"));
		MyDomainEntity myInexistingDomainEntity = myRegistryContract.get("10");
		System.out.println(myInexistingDomainEntity);
		MyDomainEntity myExistingDomainEntity = myRegistryContract.get("1");
		System.out.println(myExistingDomainEntity);
	}
}
