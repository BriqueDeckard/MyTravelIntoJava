package behavioral.gof.iterator;

public interface Container <T>{
	MyIteratorContract<T> getIterator();
}
