package gang_of_four.behavioral.iterator;

public interface Container <T>{
	MyIteratorContract<T> getIterator();
}
