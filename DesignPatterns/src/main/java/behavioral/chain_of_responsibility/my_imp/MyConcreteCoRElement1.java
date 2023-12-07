package behavioral.chain_of_responsibility.my_imp;


import behavioral.chain_of_responsibility.my_imp.domain.MyConcreteElementToProcess1;
import behavioral.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public class MyConcreteCoRElement1 extends MyAbstractCoRElement {
	public MyConcreteCoRElement1(MyAbstractCoRElement nextLink) {
		super(nextLink);
	}

	public MyConcreteCoRElement1() {
	}

	@Override
	public boolean isProcessed(MyElementToProcessContract elementToProcess) {
		if (elementToProcess instanceof MyConcreteElementToProcess1) {
			elementToProcess.processElement();
			System.out.println(this.getClass().getSimpleName() + " CAN PROCESS " + elementToProcess.getClass().getSimpleName());
			return true;
		} else if (nextLink != null) {
			System.out.println(this.getClass().getSimpleName() + " CANNOT PROCESS, " + elementToProcess.getClass().getSimpleName() + " TRANSFERING TO : " + nextLink.getClass().getSimpleName());
			return nextLink.isProcessed(elementToProcess);
		} else {
			System.out.println(this.getClass().getSimpleName() + " CANNOT PROCESS " + elementToProcess.getClass().getSimpleName());
			System.out.println("Cannot process");
			return false;
		}
	}
}
