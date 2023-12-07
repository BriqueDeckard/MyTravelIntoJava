package behavioral.interpreter;

public class ExpressionIntegerNumber implements Expression<Integer>{
	private int number;

	public ExpressionIntegerNumber(int number) {
		this.number = number;
	}

	@Override
	public Integer interpret() {
		return number;
	}
}
