package behavioral.interpreter;

public class MyInterpreterApp {
	public static void main(String[] args) {
		MyExpressionIntegerNumber ten = new MyExpressionIntegerNumber(10);
		MyExpressionIntegerNumber five = new MyExpressionIntegerNumber(5);
		MyExpressionIntegerPlusOperator additionner =
				new MyExpressionIntegerPlusOperator(ten, five);
		System.out.println(additionner.interpret());
	}
}
