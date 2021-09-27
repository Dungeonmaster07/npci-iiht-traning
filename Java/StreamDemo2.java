package iiht_Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<String> basket = Arrays.asList("Cherry","Apple","Mango","Papaya","Banana");
        basket.forEach(System.out::println);
        basket.stream().sorted().forEach(System.out::println);
        basket.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

        basket.stream().filter(s -> s.contains("a")).forEach(System.out::println);
        Stream.of("Jack","Anna","Sean","Bret").sorted().forEach(System.out::println);

    }
}
