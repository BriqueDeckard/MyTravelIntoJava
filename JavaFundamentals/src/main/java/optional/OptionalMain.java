package optional;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class OptionalMain {
    public static void main(String[] args) {
//        valuePresence();
//        ifPresent();
//        orElse();
//        orElseGet();
//        filterAndIfPresentOrElse();
//        map();
//        optionalFlatMap();
        optionalOr();
        optionalStream();
    }

    private static void optionalStream() {
        Optional<String> optional = Optional.of("Hello");
        String collect = optional.stream()
                .flatMap(s -> s.chars().mapToObj(c -> String.valueOf((char) c)))
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }

    private static void optionalOr() {
        Optional<String> optionalString = Optional.ofNullable(null);
        Optional<String> yopla = optionalString.or(() -> Optional.ofNullable("Yopla"));
        System.out.println(yopla.isPresent());
    }

    private static void optionalFlatMap() {
        SampleClass sampleClass = new SampleClass("first", "last", 34);
        Optional<? extends SampleClass> sample = Optional.of(sampleClass);
        String firstOrLast = sample.flatMap(SampleClass::getFirstName).orElse("Last");
        System.out.println(firstOrLast);
    }

    private static void map() {
        Optional<String> value = Optional.of("Hello");
        Optional<String> newValue = value.map(output -> "<b>" + output + "</b>");
        newValue.ifPresent(System.out::println);
    }

    private static void filterAndIfPresentOrElse() {
        for (int i = 0; i < 10; i++) {
            Optional<Integer> optional = Optional.of(i);
            int finalI = i;
            optional.filter(integer -> integer > 5).ifPresentOrElse((present) -> {
                        System.out.println(present + " is present");
                    },
                    () -> {
                        System.out.println("For " + finalI + " There is nothing");
                    });

        }
    }

    private static void orElseGet() {
        Optional<String> empty = Optional.ofNullable(null);
        Supplier<String> stringSupplier = () -> "Yo bro";
        String supplied = empty.orElseGet(stringSupplier);
        System.out.println(supplied);
    }

    private static void orElse() {
        Optional<String> empty = Optional.ofNullable(null);
        String riqou = empty.orElse("Riqou");
        System.out.println(riqou);
    }

    private static void ifPresent() {
        Optional<String> optional = Optional.of("Hello");
        Consumer<String> consumer = System.out::println;
        optional.ifPresent(consumer);
    }

    private static void valuePresence() {
        optionalWithEmptyValue();
        optionalWithStringValue();
        optionalWithNullTryCatch();
        optionalWithNullable();
    }

    private static void optionalWithNullTryCatch() {
        try {
            optionalWithNullValue();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void optionalWithNullable() {
        String name = null;
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent());
    }

    private static void optionalWithNullValue() {
        String name = null;
        Optional<String> optional = Optional.of(name);
        System.out.println(optional.isPresent());
    }

    private static void optionalWithStringValue() {
        String name = "Deq4";
        Optional<String> optionalString = Optional.of(name);
        System.out.println(optionalString.isPresent());
    }

    private static void optionalWithEmptyValue() {
        Optional<String> optional = Optional.empty();
        System.out.println(optional.isPresent());
    }
}
