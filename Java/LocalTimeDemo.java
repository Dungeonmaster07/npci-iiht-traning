package iiht_Assignments;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalTime t2 = LocalTime.of(14, 25);
        System.out.println(t2);
        LocalTime t3 = LocalTime.parse("09:45");
        System.out.println(t3);
    }
}
