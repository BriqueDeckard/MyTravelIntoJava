package structural.delegation;

public class MyConcreteDelegateB implements MyDelegateContract {

		@Override
		public void print(String message) {
			System.out.printf("MyConcretePrinterB : "+ message);
		}

}
