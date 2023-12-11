package gang_of_four.behavioral.iterator;

public interface MyIteratorContract<T> {
	boolean hasNext();
	T next();
}
