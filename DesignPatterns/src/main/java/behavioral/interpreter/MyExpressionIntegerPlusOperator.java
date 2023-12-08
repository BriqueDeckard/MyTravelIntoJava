package behavioral.interpreter;

public class MyExpressionIntegerPlusOperator implements MyExpression<Integer> {
	private MyExpression<Integer> left;
	private MyExpression<Integer> right;

	public MyExpressionIntegerPlusOperator(MyExpression<Integer> left, MyExpression<Integer> right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer interpret() {
		return left.interpret() + right.interpret();
	}
}
