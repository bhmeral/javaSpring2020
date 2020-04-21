package day18NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice4Hotel {
    public static void main(String[] args) {

        /*
        king bed 120
        queen bed 100
        single bed 80

        should ask which bedroom dou you wanna reserve
        if user provided ınvalid entry ==> re enter
         */
        Scanner input =  new Scanner(System.in);
        int kingbed = '$' + 120;
        int queenbed = '$' + 100;
        int singlebed = '$' + 80;
        int bill = ' ';


        while(true) {
            System.out.println("Welcome To Our Hotel");
            System.out.println("Which bedroom do you wanna reserve");
            String reserve = input.nextLine();
            while (!(reserve.equalsIgnoreCase("king bed")) || !(reserve.equalsIgnoreCase("queen bed")) || !(reserve.equalsIgnoreCase("single bed"))) {
                System.out.println("Invalid Entry! Please Re-Enter.");
                input.nextLine();
            }
            if (reserve.equalsIgnoreCase("king bed")) {
                System.out.println("You reserved King Bed");
                kingbed += bill;
            } else if (reserve.equalsIgnoreCase("queen bed")) {
                System.out.println("You reserved Queen Bed");
                queenbed += bill;
            } else if(reserve.equalsIgnoreCase("single bed")) {
                System.out.println("You reserved Single Bed");
                singlebed += bill;
            }
            System.out.println(bill);
            if ((reserve.equalsIgnoreCase("king bed")) || !(reserve.equalsIgnoreCase("queen bed")) || (reserve.equalsIgnoreCase("single bed"))){
                System.out.println("Have A Nice Stay At Our Hotel");
                break;
            }







        }

    }
}