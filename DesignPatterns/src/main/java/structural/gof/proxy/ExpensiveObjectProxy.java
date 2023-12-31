package structural.gof.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject{
	private ExpensiveObject expensiveObject;
	@Override
	public void process() {
		// Lazy
		if(expensiveObject == null){
			expensiveObject = new ExpensiveObjectImpl();
		}
		expensiveObject.process();
	}
}
