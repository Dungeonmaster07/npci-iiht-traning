package iiht_Assignments;

public class AnotherCar {
    private String model;
    private String[] anotherFeature;

    public AnotherCar(String model, String... anotherFeature){
        this.model=model;
        this.anotherFeature=anotherFeature;
    }
    public void specs(){
        System.out.println("Features of : "+model);
        for(String str: anotherFeature){
            System.out.println("---"+str);
        }
    }

    public static void main(String[] args) {
        AnotherCar ac = new AnotherCar("Hyundai","Good Looking","High Mileage");

        ac.specs();
    }
}
