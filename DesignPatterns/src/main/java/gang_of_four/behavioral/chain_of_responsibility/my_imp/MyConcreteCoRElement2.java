package gang_of_four.behavioral.chain_of_responsibility.my_imp;


import gang_of_four.behavioral.chain_of_responsibility.my_imp.domain.MyConcreteElementToProcess2;
import gang_of_four.behavioral.chain_of_responsibility.my_imp.domain.contracts.MyElementToProcessContract;

public class MyConcreteCoRElement2 extends MyAbstractCoRElement {

	public MyConcreteCoRElement2() {
	}

	public MyConcreteCoRElement2(MyAbstractCoRElement nextLink) {
		super(nextLink);
	}

	@Override
	public boolean isProcessed(MyElementToProcessContract elementToProcess) {
		if (elementToProcess instanceof MyConcreteElementToProcess2) {
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
