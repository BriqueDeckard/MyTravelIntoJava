package behavioral.interpreter;

public class ExpressionIntegerPlusOperator implements Expression<Integer> {
	private Expression<Integer> left;
	private Expression<Integer> right;

	public ExpressionIntegerPlusOperator(Expression<Integer> left, Expression<Integer> right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer interpret() {
		return left.interpret() + right.interpret();
	}
}
