package java_fundamentals.core_classes.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MyHashmapApp {
	public static final Map<String, String> firstMap;

	static {
		firstMap = new HashMap<>();
		firstMap.put("k1", "Value 1");
		firstMap.put("k2", "Value 2");
	}

	// La hashmap est là pour stocker un objet a un endroit precis
	public static void main(String[] args) {
		Map<String, MyHashmapValueImp> childrenByName = new HashMap<>();
		MyHashmapValueImp mHMCI1 = new MyHashmapValueImp("Ben");
		MyHashmapValueImp mHMCI2 = new MyHashmapValueImp("Paul");
		MyHashmapValueImp mHMCI3 = new MyHashmapValueImp("Clara");
		MyHashmapValueImp mHMCINull = new MyHashmapValueImp("Strapontin");
		// Adding
		childrenByName.put("B", mHMCI1);
		childrenByName.put("P", mHMCI2);
		childrenByName.put("C", mHMCI3);
		// With null as key
		childrenByName.put(null, mHMCINull);

		// WIth custom key
		Map<MyHashmapKeyImp, MyHashmapValueImp> childrenByKeys = new HashMap<>();
		MyHashmapKeyImp b = new MyHashmapKeyImp(1, "B");
		MyHashmapKeyImp p = new MyHashmapKeyImp(2, "P");
		childrenByKeys.put(b, mHMCI1);
		childrenByKeys.put(p, mHMCI2);

		// Get
		System.out.println(childrenByName.get("P").getName());
		System.out.println(childrenByName.get(null).getName());
		System.out.println(childrenByKeys.get(b).getName());
		// Remove
		childrenByName.remove(null);
		System.out.println(childrenByName.get(null));

		// Exists
		System.out.println(childrenByName.containsKey(null));
		System.out.println(childrenByName.containsKey("Clara"));

		// Iterating
		// --> Set of keys
		for (String key : childrenByName.keySet()) {
			System.out.println("K: " + key + ", V: " + childrenByName.get(key));
		}

		childrenByKeys.forEach((key, value) -> System.out.println("K: " + key + " - V: " + value));

		// GetOrDefault
		MyHashmapKeyImp z = new MyHashmapKeyImp(1000, "Z");
		System.out.println(childrenByKeys.getOrDefault(z, mHMCI3));

		// PutIfAbsent
		childrenByKeys.putIfAbsent(z, mHMCI3);

		childrenByKeys.compute(z, (k, v) -> {
			if (v != null) {
				System.out.println(v.getName());
				return v;
			} else {
				return mHMCI3;
			}
		});

		// Static map
		System.out.println(firstMap.get("k1"));
	}
}
