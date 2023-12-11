package gang_of_four.structural.flyweight;

public class MyFlyWeightApp {
	public static void main(String[] args) {
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		MyFlyweight flyweight1 = flyweightFactory.getFlyweight("key1");
		MyFlyweight flyweight2 = flyweightFactory.getFlyweight("key2");
		flyweight1.operation();
		flyweight2.operation();
	}
}
