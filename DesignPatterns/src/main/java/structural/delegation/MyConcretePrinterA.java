package structural.delegation;

import static java.lang.String.*;

public class MyConcretePrinterA implements MyPrinterContract{

		@Override
		public void print(String message) {
			System.out.printf("MyConcretePrinterA : " +  message);
		}

}
