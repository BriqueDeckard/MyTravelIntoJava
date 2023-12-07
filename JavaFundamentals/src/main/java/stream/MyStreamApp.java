package stream;

import static java.lang.String.join;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyStreamApp {
	static final Logger LOGGER = LogManager.getLogger(MyStreamApp.class);

	public static void main(String[] args) {
		String[] array = new String[] { "a", "b", "c", "d", "e" };
		// Initialization
		Stream<String> stream1 = Arrays.stream(array);
		Stream<String> stream2 = Stream.of("a", "b", "c");
		Stream<String> streamEmpty = Stream.empty();
		Stream<String> builtStream = Stream.<String>builder().add("a").add("b").add("c").build();
		Stream<String> generatedStream = Stream.generate(() -> "a").limit(5);
		// first browse
		LOGGER.trace("STREAM 1 :");
		stream1.forEach(LOGGER::trace);
		LOGGER.trace("STREAM 2 :");
		stream2.forEach(LOGGER::trace);
		LOGGER.trace("STREAM EMPTY :");
		streamEmpty.forEach(LOGGER::trace);
		LOGGER.trace("STREAM BUILT :");
		builtStream.forEach(LOGGER::trace);
		LOGGER.trace("STREAM GENERATED :");
		generatedStream.forEach(LOGGER::trace);
		LOGGER.trace("PARA :");
		parallelization(array);
		LOGGER.trace("ITERATING :");
		iterating(array);
		LOGGER.trace("FILTERING :");
		// Filtering
		filtering();
		LOGGER.trace("MAPPING :");
		// Mapping
		mapping(array);
		LOGGER.trace("MATCHING :");
		// Matching
		matching(array);
		LOGGER.trace("REDUCING :");
		// Reduce
		reducing(array);
		String onceModifiedStream =
				Stream.of("abcd", "bbcd", "cbcd").skip(1).collect(Collectors.joining(", "));
		LOGGER.trace("onceModifiedStream {}", onceModifiedStream);
		LOGGER.trace("CALL ORDER :");
		callOrder();
		collecting();

	}

	private static void collecting() {
		// Collecting
		Stream<String> strStream = Stream.of("A", "B", "C", "D");
		Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
		// - toCollection
		Set<String> stringSet = strStream
				.collect(Collectors.toSet());
		LOGGER.trace("stringSet: {}", stringSet);
		// - toMap
		Map<String, Integer> collectedToMap = Stream.of("A", "BB", "CCC", "DDDD", "EEEEE")
				.collect(Collectors.toMap(Function.identity(), String::length));
		LOGGER.trace("collectedToMap: {}", collectedToMap);
		// - toMap with collision
		Map<String, Integer> collectedToMapWithCollision = Stream.of("A", "BB", "CCC", "BB", "EEEEE")
				.collect(Collectors.toMap(
						Function.identity(),
						String::length,
						(item, identicalItem) -> item
				));
		LOGGER.trace("collectedToMapWithCollision: {}", collectedToMapWithCollision);
		// - toString
		String joinedStr = integerStream.map(Object::toString)
				.collect(Collectors.joining(", "));
		LOGGER.trace("joinedStr: {}", joinedStr);
		String collectedWithPrefixAndSuffix = Stream.of("A", "B", "C", "D")
				.collect(Collectors.joining(" ", "PRE-", "-POST"));
		LOGGER.trace("collectedWithPrefixAndSuffix: {}", collectedWithPrefixAndSuffix);
		// - toAverage
		Double averaged = Stream.of(1, 2, 3, 4, 5)
				.collect(Collectors.averagingInt(y -> y));
		LOGGER.trace("averaged: {}", averaged);
		// - toSum
		Integer summed = Stream.of(1, 2, 3, 4, 5)
				.collect(Collectors.summingInt(x -> x));
		LOGGER.trace("Summed: {}", summed);
		// -summarizing
		IntSummaryStatistics summarized = Stream.of(1, 2, 3, 4, 5)
				.collect(Collectors.summarizingInt(x -> x));
		LOGGER.trace("Summarized : {}", summarized);
		// groupingBy
		Map<Boolean, List<String>> containsA = Stream.of("AA", "BA", "CA", "DA", "AB", "BB", "CB", "DB")
				.collect(Collectors.groupingBy(x -> x.contains("A")));
		LOGGER.trace("Contains A: {}", containsA);
		// partitioningBy
		Map<Boolean, List<String>> partitionedByB = Stream.of("AA", "BA", "CA", "DA", "AB", "BB", "CB", "DB")
				.collect(Collectors.partitioningBy(element -> element.contains("B")));
		LOGGER.trace("Partitionned : {}", partitionedByB);
		// collectingAndThen
		String stringCollected = Stream.of("AA", "BA", "CA", "DA", "AB", "BB", "CB", "DB")
				.collect(Collectors.collectingAndThen(Collectors.partitioningBy(element -> element.contains("D")),
						booleanListMap -> booleanListMap.values().stream()
								.flatMap(Collection::stream)
								.collect(Collectors.joining(" , "))));
		LOGGER.trace("Collected and then: {}", stringCollected);
		// Custom collector
		Stream.of("AA", "BA", "CA", "DA", "AB", "BB", "CB", "DB").collect(
				Collector.of(
						// new result container
						ArrayList::new,
						// accumulator
						ArrayList::add,
						// Combiner
						(first, second) -> {
							first.add(second);
							return first;
						}));
		MyCustomCollector<String> stringMyCustomCollector = new MyCustomCollector<>();
		ArrayList<String> collectCustom =
				Stream.of("AA", "BA", "BB", "DA", "AB", "BB", "CB", "DB").collect(stringMyCustomCollector);
		LOGGER.trace("collectCustom: {}", collectCustom);

		// throwing
		Set<MyElementThatCanThrow> setOfElementThatCanThrow = Stream.of(
						new MyElementThatCanThrow("A"),
						new MyElementThatCanThrow("B")
				).filter(element -> {
					try {
						return (element.getName().equals("AA"));
					} catch (Exception e) {
						LOGGER.error(e);
					}
					return false;
				})
				.collect(Collectors.toSet());


	}

	private static class MyCustomCollector<T> implements Collector<T, Set<T>, ArrayList<T>> {

		// The supplier() method returns a Supplier instance that generates an empty accumulator instance.
		@Override
		public Supplier<Set<T>> supplier() {
			return HashSet::new;
		}

		// The accumulator() method returns a function that is used for adding a new element to an existing accumulator object.
		@Override
		public BiConsumer<Set<T>, T> accumulator() {
			return Set::add;
		}

		// The combiner() method returns a function that is used for merging two accumulators together
		@Override
		public BinaryOperator<Set<T>> combiner() {
			return (left, right) -> {
				left.addAll(right);
				return left;
			};
		}

		//The finisher() method returns a function that is used for converting an accumulator to final result type.
		@Override
		public Function<Set<T>, ArrayList<T>> finisher() {
			return ArrayList::new;
		}

		// The characteristics() method is used to provide Stream with some additional information that will be used for internal optimizations.
		@Override
		public Set<Characteristics> characteristics() {
			return Set.of(Characteristics.UNORDERED);
		}
	}

	static class MyElementThatCanThrow {
		public MyElementThatCanThrow(String name) {
			this.name = name;
		}

		private String name;

		public String getName() {
			throw new IllegalArgumentException("Error ! ");
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	private static void callOrder() {
		List<String> list = Arrays.asList("abc1", "abc2", "abc3");
		Optional<String> stream = list.stream().filter(element -> {
			LOGGER.info("filter() was called");
			return element.contains("2");
		}).map(element -> {
			LOGGER.info("map() was called");
			return element.toUpperCase();
		}).findFirst();
	}

	private static void reducing(String[] array) {
		Optional<String> reduce1 = Arrays.stream(array).reduce((x, y) -> x + "/" + y);
		reduce1.ifPresent(LOGGER::trace);
		String reduce2 = Arrays.stream(array).reduce("RESULT", (x, y) -> x + "/" + y);
		LOGGER.trace("reduce 2 {}", reduce2);
		// reduce(IntBinaryOperator op);
		OptionalInt reduced1 = IntStream.range(1, 10).reduce((a, b) -> a + b);
		reduced1.ifPresent(LOGGER::trace);
		// reduce(int identity, IntBinaryOperator op);
		int reduced2 = IntStream.range(1, 10).reduce(100, (a, b) -> a + b);
		LOGGER.trace("Reduced 2 : {}", reduced2);
		//  <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
		String reduced3 = Stream.of("AA", "BB", "CC", "DD")
				.parallel() // To make a combiner work, a stream should be parallel:
				.reduce("IDENTITY_", (a, b) -> {
					LOGGER.trace("reduce.accumulator called: {}", a + " accumuled " + b);
					return a + "-CUMULED-" + b;
				}, (a, b) -> {
					LOGGER.trace("reduce.combiner called: {}", a + "combined" + b);
					return a + "-COMBINED-" + b;
				});
		LOGGER.trace("Reduced 3 : {}", reduced3);
	}

	private static void matching(String[] array) {
		boolean bIsPresent = Arrays.stream(array).anyMatch(element -> element.contains("b"));
		LOGGER.trace("B is present: {}", bIsPresent);
		boolean zzIsMissing = Arrays.stream(array).anyMatch(element -> element.contains("zz"));
		LOGGER.trace("zz Is Missing: {}", zzIsMissing);
		boolean allContainsE = Arrays.stream(array).allMatch(element -> element.contains("E"));
		LOGGER.trace("all Contains E: {}", allContainsE);
		boolean noneMatch = Arrays.stream(array).noneMatch(element -> element.contains("E"));
		LOGGER.trace("None contains e : {}", noneMatch);
		boolean noneIsNull = Arrays.stream(array).allMatch(Objects::nonNull);
		LOGGER.trace("None is null : {}", noneIsNull);
	}

	private static void mapping(String[] array) {
		ArrayList<String> capsLock1 = new ArrayList<>();
		for (String s : array) {
			capsLock1.add(s.toUpperCase());
		}
		LOGGER.trace(String.join(",", capsLock1));

		LOGGER.trace(Arrays.stream(array).map(String::toUpperCase).collect(Collectors.joining(",")));
	}

	private static void filtering() {
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
		ArrayList<String> filtered = new ArrayList<>();
		for (String s : list) {
			if (s.contains("d")) {
				filtered.add(s);
			}
		}
		LOGGER.trace(join(",", filtered));

		LOGGER.trace(list.stream().filter(s -> s.contains("d")).collect(Collectors.joining(",")));
	}

	private static void iterating(String[] array) {
		boolean found1 = false;
		// Iterating
		for (String string : array) {
			if (string.contains("a")) {
				found1 = true;
			}
		}
		LOGGER.trace("FOUND: {}", found1);

		// Can be replaced by
		Stream<String> stream3 = Arrays.stream(array);
		boolean found2 = stream3.anyMatch(string -> string.contains("a"));
		LOGGER.trace("FOUND: {}", found2);
	}

	private static void parallelization(String[] array) {
		Arrays.stream(array).parallel().forEach(LOGGER::trace);
		Arrays.stream(array).parallel().forEach(LOGGER::trace);
	}
}
