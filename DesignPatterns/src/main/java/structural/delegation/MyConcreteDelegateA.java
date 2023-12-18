package structural.delegation;

public class MyConcreteDelegateA implements MyDelegateContract {

		@Override
		public void print(String message) {
			System.out.printf("MyConcretePrinterA : " +  message);
		}

}
