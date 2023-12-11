package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, MyFlyweight> flyweights = new HashMap<>();

	public MyFlyweight getFlyweight(String key) {
		if (!flyweights.containsKey(key)) {
			flyweights.put(key, new MyConcreteFlyweight(key));
		}
		return flyweights.get(key);
	}
}
