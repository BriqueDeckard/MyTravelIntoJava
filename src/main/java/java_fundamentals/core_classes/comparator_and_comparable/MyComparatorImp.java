package java_fundamentals.core_classes.comparator_and_comparable;

import java.util.Comparator;

public class MyComparatorImp implements Comparator<MyComparableImp> {
	@Override
	public int compare(MyComparableImp o1, MyComparableImp o2) {
		return Integer.compare(o1.getRank(), o2.getRank());
	}
}
