package gang_of_four.structural.proxy;

public class MyProxyApp {
	public static void main(String[] args) {
		ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
		expensiveObject.process();
	}
}
