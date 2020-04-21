package Repl_it;

import java.util.Scanner;

public class repl_it_35_ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);





        String item = scan.nextLine();
        if (item.equalsIgnoreCase("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balanca is: 75$");
        }else if (item.equalsIgnoreCase("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 50$");
        }else if (item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card");
        }else if (item.equalsIgnoreCase("Charger")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 75$");
        }else if (item.equalsIgnoreCase("USB Cable")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 90$");
        }else if (item.equalsIgnoreCase("Headphones")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 70$");
        } else if (item.equalsIgnoreCase("Hat")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 75$");
        }else if (item.equalsIgnoreCase("Socks")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 95$");
        }else if (item.equalsIgnoreCase("Blanket")) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 40$");
        }else if (item.equalsIgnoreCase("Pillow") ){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 60$");
        }











        else{
            System.out.println("Invalid Item!");
        }


    }
}
