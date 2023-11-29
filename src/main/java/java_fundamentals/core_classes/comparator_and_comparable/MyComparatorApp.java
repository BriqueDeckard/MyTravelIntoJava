package java_fundamentals.core_classes.comparator_and_comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyComparatorApp {

	public static void main(String[] args) {
		comparable();
		comparator();
		anonymousComparator();

	}

	private static void anonymousComparator() {
		List<MyComparableImp> list = Arrays.asList(
				new MyComparableImp(10, "Pierre"),
				new MyComparableImp(5, "Samuel"),
				new MyComparableImp(35, "Rachid")
		);
		Comparator<MyComparableImp> anonymousComparator = Comparator.comparingInt(MyComparableImp::getRank);
//		Comparator<MyComparableImp> anonymousComparator = (imp1, imp2) -> imp1.getRank() - imp2.getRank();
		list.sort(anonymousComparator);
	}

	private static void comparator() {
		List<MyComparableImp> list = Arrays.asList(
				new MyComparableImp(10, "Pierre"),
				new MyComparableImp(5, "Samuel"),
				new MyComparableImp(35, "Rachid")
		);
		System.out.println(list.stream().map(u -> u.getRank() + "-" + u.getName()).collect(Collectors.joining(", ")));
		MyComparatorImp myComparatorImp = new MyComparatorImp();
		list.sort(myComparatorImp);
		System.out.println(list.stream().map(u -> u.getRank() + "-" + u.getName()).collect(Collectors.joining(", ")));
	}

	private static void comparable() {
		List<MyComparableImp> list = Arrays.asList(
				new MyComparableImp(10, "Pierre"),
				new MyComparableImp(5, "Samuel"),
				new MyComparableImp(35, "Rachid")
		);
		System.out.println(list.stream().map(u -> u.getRank() + "-" + u.getName()).collect(Collectors.joining(", ")));
		Collections.sort(list);
		System.out.println(list.stream().map(u -> u.getRank() + "-" + u.getName()).collect(Collectors.joining(", ")));
	}
}
