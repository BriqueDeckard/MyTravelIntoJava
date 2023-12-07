package behavioral.interpreter;

public class MyInterpreterApp {
	public static void main(String[] args) {
		ExpressionIntegerNumber ten = new ExpressionIntegerNumber(10);
		ExpressionIntegerNumber five = new ExpressionIntegerNumber(5);
		ExpressionIntegerPlusOperator additionner =
				new ExpressionIntegerPlusOperator(ten, five);
		System.out.println(additionner.interpret());
	}
}
