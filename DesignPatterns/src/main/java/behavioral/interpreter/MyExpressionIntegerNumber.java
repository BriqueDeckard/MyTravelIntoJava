package behavioral.interpreter;

public class MyExpressionIntegerNumber implements MyExpression<Integer> {
	private int number;

	public MyExpressionIntegerNumber(int number) {
		this.number = number;
	}

	@Override
	public Integer interpret() {
		return number;
	}
}
