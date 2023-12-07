package behavioral.chain_of_responsibility.my_imp.domain;


import behavioral.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public class MyConcreteElementToProcess1 implements MyElementToProcessContract {
	@Override
	public void processElement() {
		System.out.println("Concrete element 1".toUpperCase());
	}
}
