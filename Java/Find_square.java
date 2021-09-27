package iiht_Assignments;

import java.util.Scanner;

public class Find_square {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number ::");
        int num = sc.nextInt();
        while (num != 0) {
            num = num / 10;
            count++;
        }
        int count2 = 0;
        if (count % 2 == 0) {
            count2 = count * count;
        } else {
            count2 = count ^ count;
        }
        System.out.println("Number of digits in the entered integer are :: " + count);
        System.out.println("The square is"+ count2);
        sc.close();
    }

}
