package compil.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainWithStream {
    public static void main(String[] args) {
        List<String> myList = List.of("a", "bb", "ccc", "dddd");
        myList.stream().forEach(System.out::println);
        Set<String> set = myList.stream().collect(Collectors.toSet());
        set.stream().filter(s -> s.length() > 3).forEach(System.out::println);
    }
}
