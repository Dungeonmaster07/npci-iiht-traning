package iiht_Assignments;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo3 {
    public static void main(String[] args) {
        Map<String, String> people = new HashMap<String, String>();
        people.put("Polo", "Pune");
        people.put("Mill", "Mumbai");
        people.values().forEach(System.out::println);

        List<String> cities = people.values().stream().sorted().collect(Collectors.toList());
        cities.forEach(System.out::println);

        Map<String, List<String>> contacts = new HashMap<>();
        contacts.put("Frudo", Arrays.asList("1212-3434", "5656"));
        contacts.put("Jack", Arrays.asList("1212-3434", "5656"));
        contacts.put("Sam", Arrays.asList("1212-3434", "5656"));

        contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);



    }
}
