package behavioral.gof.chain_of_responsibility.my_imp;


import behavioral.gof.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public abstract class MyAbstractCoRElement {

	public MyAbstractCoRElement nextLink;

	protected MyAbstractCoRElement(MyAbstractCoRElement nextLink) {
		this.nextLink = nextLink;
	}

	protected MyAbstractCoRElement() {
	}

	public abstract boolean isProcessed(MyElementToProcessContract elementToProcess);
}
