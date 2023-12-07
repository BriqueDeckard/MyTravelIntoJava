package creational.prototype.example;

import java.util.HashMap;
import java.util.Map;

public class PrototypeImpl implements Cloneable {
	private final Map<String, String> contents = new HashMap<>();

	public void setValue(String key, String value) {
		contents.put(key, value);
	}

	public String getValue(String key) {
		return contents.get(key);
	}

	@Override
	protected PrototypeImpl clone() throws CloneNotSupportedException {
		// ICI on implémente le comportement qui va ajouter les infos qu'on veut a notre clone
		PrototypeImpl result = new PrototypeImpl();
		this.contents.forEach(result::setValue);
		return result;
	}
}
