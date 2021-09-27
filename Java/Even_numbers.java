package iiht_Assignments;

import java.util.Scanner;

public class Even_numbers {
    public static boolean Even(int num1, int num2){
        if(num1%2==0){
            if(num2>0){
                num2=num2-num1;
                if(num2==0) return true;
            }

        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if (Even(num1, num2) == true)
            System.out.println("The number is even and previous number is multiple of this number");
        else
            System.out.println("The number is not even");
    }
}
