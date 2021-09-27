package iiht_Assignments;

public class Child extends Father{
    public void myProps(int sal, int houses,int noOfCars){
        int mySal=sal+100000;
        int noOfVehicles=noOfCars+1;
        int accomodation = houses+1;
        System.out.println(mySal+" "+noOfVehicles+" "+accomodation);

    }
    public static void main(String args[]){
        Child ch = new Child();
        ch.GrandFatherProperties();
        ch.FatherProperties(50000, 1);
        ch.myProps(50000, 1,1);
    }
}
