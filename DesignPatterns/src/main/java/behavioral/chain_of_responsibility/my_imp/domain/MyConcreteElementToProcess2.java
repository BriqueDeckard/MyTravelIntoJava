package behavioral.chain_of_responsibility.my_imp.domain;


import behavioral.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public class MyConcreteElementToProcess2 implements MyElementToProcessContract {
	@Override
	public void processElement() {
		System.out.println("Concrete element 2".toUpperCase());
	}
}
