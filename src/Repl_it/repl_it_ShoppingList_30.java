package Repl_it;

import java.util.Scanner;

public class repl_it_ShoppingList_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String report = "";
        double Total_Price = 0;



        System.out.println("Enter Item1, count and its price:");
        String item1 = input.next();
        double price1 = input.nextDouble();
        int count1 = input.nextInt();
        Total_Price += price1*count1;

        System.out.println("Enter Item2, count and its price:");
        String item2 = input.next();
        double price2 = input.nextDouble();
        int count2 = input.nextInt();
        Total_Price += price2*count2;


        System.out.println("Enter Item3, count and its price");
        String item3 = input.next();
        double price3 = input.nextDouble();
        int count3 = input.nextInt();
        Total_Price += price3*count3;


        String item1pr = "\""+"Item1: " + item1 + " Price: " + price1 +", ";
        String item3pr =  "Item3: " + item3 + " Price: " + price3+"\"" ;
        String item2pr = "Item2: " + item2 + " Price: " + price2;

        if(count1<=0){
                report = item2pr + item3pr;
        }else if(count2<=0){
                report = item1pr + item3pr;
        }else if(count3<=0){
                report = item1pr + item2pr;
        }else{
                report = item1pr + item2pr + item3pr;
        }







        System.out.println(report);
        System.out.println("Total Price: " + Total_Price);
        
    }

}
