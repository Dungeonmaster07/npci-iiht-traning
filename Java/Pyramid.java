package iiht_Assignments;

import java.util.Scanner;

public class Pyramid {
    public static void main(String args[]){
        int n=4;
        int sum=1;
        int result=2;
        for (int i=0; i<1; i++){
            for (int j=n-1; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.print("1");
            }
            System.out.println();
        }
        for (int i=1; i<n; i++){
            for (int j=n-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=1; j++){
                System.out.print(result+" ");
                sum=sum+result;
            }
            result=sum;
            System.out.println();
        }
    }
}
