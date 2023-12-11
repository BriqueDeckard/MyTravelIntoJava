package behavioral.gof.iterator;

public interface MyIteratorContract<T> {
	boolean hasNext();
	T next();
}
