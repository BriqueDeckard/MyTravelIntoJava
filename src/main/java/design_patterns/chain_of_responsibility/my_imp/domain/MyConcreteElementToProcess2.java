package design_patterns.chain_of_responsibility.my_imp.domain;

import design_patterns.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public class MyConcreteElementToProcess2 implements MyElementToProcessContract {
	@Override
	public void processElement() {
		System.out.println("Concrete element 2".toUpperCase());
	}
}
