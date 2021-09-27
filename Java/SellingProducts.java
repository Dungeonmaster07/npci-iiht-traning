package iiht_Assignments;

import java.util.Scanner;

public class SellingProducts {

    int priceOfMobile;
    int priceOfPant;

}
class SellerOne extends SellingProducts{


    void productOne(String mobile, int priceOfMobile){
        System.out.println(mobile+" has a price of "+priceOfMobile);

    }
    void productTwo(String pant, int priceOfPant){

        System.out.println(pant+" has a price of "+priceOfPant);
    }
}
class SellerTwo extends SellingProducts{
    void productOne(String mobile, int priceOfMobile){
        System.out.println(mobile+" has a price of "+priceOfMobile);

    }
    void productTwo(String pant, int priceOfPant){

        System.out.println(pant+" has a price of "+priceOfPant);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st;
        SellingProducts sp = new SellingProducts();
        SellerOne sp1 = new SellerOne();
        SellerTwo sp2 = new SellerTwo();
        sp1.priceOfMobile=50000;
        sp2.priceOfMobile=70000;
        sp1.priceOfPant=2000;
        sp2.priceOfPant=1500;

        if(sp1.priceOfMobile< sp2.priceOfMobile && sp1.priceOfPant<sp2.priceOfPant){
            sp1.productOne("Iphone", sp1.priceOfMobile);
            sp1.productTwo("Cotton Pant", sp1.priceOfPant);

        }
        else if(sp1.priceOfMobile< sp2.priceOfMobile && sp1.priceOfPant>sp2.priceOfPant){
            sp1.productOne("Iphone", sp1.priceOfMobile);
            sp1.productTwo("Cotton Pant", sp2.priceOfPant);

        }
        System.out.println("Do you want to continue Yes/No");
        st=s.next();
        if(st=="Yes"){
            sp2.productOne("Iphone", sp2.priceOfMobile);
            sp2.productTwo("Cotton pant", sp1.priceOfPant);
        }


        s.close();

    }
}
