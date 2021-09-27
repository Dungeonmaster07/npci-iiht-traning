package iiht_Assignments;

public class CarMaruti {
    public CarMaruti(){
        System.out.println("This is a car");
    }
    public void vehicleType(){
        System.out.println("Four Wheeler vehicle");
    }
}
class Maruti extends CarMaruti{
    public Maruti(){
        System.out.println("This is a type of car");
    }
    public void brand(){
        System.out.println("Brand: Maruti");
    }
    public void speed(){
        System.out.println("Speed: 80kmph");
    }
}
class Maruti_800 extends Maruti{
    public Maruti_800(){
        System.out.println("This is a type of Maruti");
    }
    public void speed(){
        System.out.println("Speed: 100kmph");
    }
    public static void main(String args[]){
        Maruti_800 mt = new Maruti_800();
        mt.vehicleType();
        mt.brand();
        mt.speed();
    }
}
