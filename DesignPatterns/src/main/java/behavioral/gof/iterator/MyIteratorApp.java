package behavioral.gof.iterator;

public class MyIteratorApp {
	public static void main(String[] args) {
		ConcreteContainer concreteContainer = new ConcreteContainer(new String[] {"a","b","c"});
		for(MyIteratorContract<String> iter = concreteContainer.getIterator(); iter.hasNext();){
			String name = iter.next();
			System.out.println(name);
		}
	}
}
