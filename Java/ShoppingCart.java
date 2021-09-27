package iiht_Assignments;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        ArrayList<Integer> tShirt=new ArrayList<Integer>(10);
        List<Integer> shirt=new ArrayList<Integer>(5);
        List<Integer> paint=new ArrayList<Integer>(15);
        List<Integer> shoes=new ArrayList<Integer>(10);
        List<Integer> socks=new ArrayList<Integer>(8);
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            tShirt.add(i);
        }
        for(int i=0;i<5;i++)
        {
            shirt.add(i);
        }
        for(int i=0;i<15;i++)
        {
            paint.add(i);
        }
        for(int i=0;i<10;i++)
        {
            shoes.add(i);
        }
        for(int i=0;i<8;i++)
        {
            socks.add(i);
        }
        System.out.println("Do You want to buy yes=Y and No =N");
        System.out.println();
        char yes=scan.next().charAt(0);
        while(yes=='y' || yes=='Y')
        {
            System.out.println("List of Available item ");

            System.out.println();
            System.out.println("1:T-Shirt Available "+tShirt.size());
            System.out.println("2:Shirt Available "+shirt.size());
            System.out.println("3:Paint Available "+paint.size());
            System.out.println("4:Shoes Available "+shoes.size());
            System.out.println("5:Socks Available "+socks.size());
            System.out.println("Choice your Options");
            System.out.println();
// Scanner scan=new Scanner(System.in);
            int option=scan.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.println("Enter number of item you want to buy");
                    int buyItem=scan.nextInt();
                    if(buyItem>tShirt.size())
                    {
                        System.out.println("Not possible");
                    }
                    else if(buyItem==tShirt.size())
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            tShirt.remove(tShirt.size()-1);
                        }
                    }
                    else
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            tShirt.remove(tShirt.size()-1);
                        }
                        System.out.println("Your item added to cart");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Enter number of item you want to buy");
                    int buyItem=scan.nextInt();
                    if(buyItem>shirt.size())
                    {
                        System.out.println("Not possible");
                    }
                    else if(buyItem==shirt.size())
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            shirt.remove(shirt.size()-1);
                        }
                    }
                    else
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            shirt.remove(shirt.size()-1);
                        }
                        System.out.println("Your item added to cart");
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Enter number of item you want to buy");
                    int buyItem=scan.nextInt();
                    if(buyItem>paint.size())
                    {
                        System.out.println("Not possible");
                    }
                    else if(buyItem==paint.size())
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            paint.remove(paint.size()-1);
                        }
                    }
                    else
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            paint.remove(paint.size()-1);
                        }
                        System.out.println("Your item added to cart");
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Enter number of item you want to buy");
                    int buyItem=scan.nextInt();
                    if(buyItem>shoes.size())
                    {
                        System.out.println("Not possible");
                    }
                    else if(buyItem==shoes.size())
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            shoes.remove(shoes.size()-1);
                        }
                    }
                    else
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            shoes.remove(shoes.size()-1);
                        }
                        System.out.println("Your item added to cart");
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Enter number of item you want to buy");
                    int buyItem=scan.nextInt();
                    if(buyItem>socks.size())
                    {
                        System.out.println("Not possible");
                    }
                    else if(buyItem==socks.size())
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            socks.remove(socks.size()-1);
                        }
                    }
                    else
                    {
                        for(int i=0;i<buyItem;i++)
                        {
                            socks.remove(socks.size()-1);
                        }
                        System.out.println("Your item added to cart");
                    }
                    break;
                }
                default :
                {
                    System.out.println("Wrong choice");
                    break;
                }
            }
            System.out.println("Are you sure you want to continue ? yes= Y and No = N");
            yes=scan.next().charAt(0);
        }
    }

}

