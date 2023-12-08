package behavioral.iterator;

public class ConcreteContainer implements Container<String> {
	public ConcreteContainer(String[] contained) {
		this.contained = contained;
	}

	public String contained[];

	@Override
	public MyIteratorContract<String> getIterator() {
		return new ConcreteMyIterator();
	}

	private class ConcreteMyIterator implements MyIteratorContract<String> {
		int index;
		@Override
		public boolean hasNext() {
			return index < contained.length;
		}

		@Override
		public String next() {
			if(this.hasNext()){
				return contained[index++];
			}
			return null;
		}
	}
}
