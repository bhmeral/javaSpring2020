package Repl_it;

import java.util.Scanner;

public class repl_it_34_coupon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int numberofcoupons = input.nextInt();

        int numberofcandybar = numberofcoupons/10;
        int numberofgumbaall = (numberofcoupons%10)/3;

        if(numberofcoupons>=3){
            System.out.println("Number of Candies: " + numberofcandybar + "\"") ;
            System.out.println("Number of Gumballs: " + numberofgumbaall + "\"") ;
        }else{
            System.out.println("Not enough coupons");
        }

    }
}
