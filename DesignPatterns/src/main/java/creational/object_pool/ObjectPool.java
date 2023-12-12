package creational.object_pool;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {
	private final Set<T> available = new HashSet<>();
	private final Set<T> inUse = new HashSet<>();

	protected abstract T create();

	public synchronized T checkOut() {
		if (available.isEmpty()) {
			available.add(create());
		}
		T instance = available.iterator().next();
		available.remove(instance);
		inUse.add(instance);
		return instance;
	}

	public synchronized void checkIn(T instance) {
		inUse.remove(instance);
		available.add(instance);
	}

	@Override
	public synchronized String toString() {
		return "ObjectPool{" +
				"available=" + available +
				", inUse=" + inUse +
				'}';
	}
}
