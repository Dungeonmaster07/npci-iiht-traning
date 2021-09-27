package iiht_Assignments;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StreamDemo1 {
    public static void main(String[] args) {
        Integer[] array1 = {1,2,3,4,5,6,1,2,3,4};
        List<Integer> number = Arrays.asList(array1);
        //number.forEach(System.out::println);

        number.stream().distinct().forEach(System.out::println);


        System.out.println(number.stream().distinct().count());

        number.stream().distinct().sorted().forEach(System.out::println);

        System.out.println(number.stream().reduce(0, (a,b) -> a+b));

        System.out.println(IntStream.range(1, 99).count());

        System.out.println(IntStream.range(1, 99).sum());

        System.out.println(IntStream.range(1, 99).skip(5).count());

        IntStream str2 = IntStream.of(2,5,7,6,8,2,3,4);
        IntSummaryStatistics statics = str2.summaryStatistics();
        System.out.println(statics);
    }
}
