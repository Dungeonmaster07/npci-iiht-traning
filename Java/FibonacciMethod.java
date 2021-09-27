package iiht_Assignments;

public class FibonacciMethod {
    int a1=0, a2=1,a3,a4;

    int Number(){
        System.out.print(a1+" "+a2);
        int i;
        for(i=2; i<15; i+=2){
            a3=a1+a2;
            System.out.print(" "+a3);
            a1=a2;
            a2=a3;
        }
        return a3;
    }
    void SecondNumber(){
        int i;
        for(i=3; i<15; i+=2){
            a4=a2+a3;
            System.out.print(" "+a4);
            a2=a3;
            a3=a4;
        }
    }
    public static void main(String args[]){
        FibonacciMethod fm = new FibonacciMethod();
        fm.Number();
        fm.SecondNumber();
    }


}
