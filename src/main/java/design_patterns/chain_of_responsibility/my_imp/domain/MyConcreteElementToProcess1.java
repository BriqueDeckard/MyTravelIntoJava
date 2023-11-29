package design_patterns.chain_of_responsibility.my_imp.domain;

import design_patterns.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public class MyConcreteElementToProcess1 implements MyElementToProcessContract {
	@Override
	public void processElement() {
		System.out.println("Concrete element 1".toUpperCase());
	}
}
