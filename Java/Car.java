package iiht_Assignments;

public interface Car {
    void wheels(int noOfwheels, int noOfGlass);
}
class Tesla implements Car{
    public  void wheels(int noOfwheels, int noOfGlass){
        int countWheels=noOfwheels;
        int countGlass=noOfGlass;
        System.out.println("Tesla has mainly "+countWheels+" wheels & "+countGlass+" glasses");
    }
}
class Bentley implements Car{

    public void wheels(int noOfwheels, int noOfGlass){
        int countWheels=noOfwheels;
        int glass=noOfGlass;
        System.out.println("Bentley has mainly "+countWheels+" wheels & "+glass+" glasses");
    }
    public static void main(String args[]){
        Tesla t = new Tesla();
        Bentley b = new Bentley();
        t.wheels(4,2);
        b.wheels(4,4);
    }
}
