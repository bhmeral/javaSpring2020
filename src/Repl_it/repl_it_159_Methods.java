package Repl_it;

import java.util.Scanner;

public class repl_it_159_Methods {

    public static String c_profits(int buyPrice, int sellPrice){
        if (buyPrice>sellPrice){
            return "Profit";
        }else if(sellPrice>buyPrice){
            return  "Loss";
        }else{
            return "No Loss";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buy price");
        int buyPrice = scan.nextInt();
        System.out.println("Enter your sell price");
        int sellPrice = scan.nextInt();
        String result = c_profits(buyPrice,sellPrice);
        System.out.println(result);
    }



}
