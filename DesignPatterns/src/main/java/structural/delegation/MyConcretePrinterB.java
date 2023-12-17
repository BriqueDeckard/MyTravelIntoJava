package structural.delegation;

public class MyConcretePrinterB implements MyPrinterContract{

		@Override
		public void print(String message) {
			System.out.printf("MyConcretePrinterB : "+ message);
		}

}
