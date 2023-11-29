package java_fundamentals.core_classes.comparator_and_comparable;

public class MyComparableImp implements Comparable<MyComparableImp> {

	private int rank;
	private String name;

	public MyComparableImp(int rank, String name) {
		this.rank = rank;
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(MyComparableImp o) {
		return Integer.compare(getRank(), o.getRank());
	}
}
