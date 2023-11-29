package design_patterns.chain_of_responsibility.my_imp;

import design_patterns.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public abstract class MyAbstractCoRElement {

	public MyAbstractCoRElement nextLink;

	protected MyAbstractCoRElement(MyAbstractCoRElement nextLink) {
		this.nextLink = nextLink;
	}

	protected MyAbstractCoRElement() {
	}

	public abstract boolean isProcessed(MyElementToProcessContract elementToProcess);
}
