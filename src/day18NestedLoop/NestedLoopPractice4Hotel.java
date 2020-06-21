package day18NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice4Hotel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        king bed 120
        queen bed 100
        single bed 80

        should ask which bedroom dou you wanna reserve
        if user provided ınvalid entry ==> re enter
         */

        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        int bill = 0;


        System.out.println("Welcome to our hotel");
        System.out.println("Which room you wanna reserve");
        String reservedRoom = scan.nextLine();

        boolean valid = (reservedRoom.equalsIgnoreCase("King Bed") || reservedRoom.equalsIgnoreCase("Queen Bed") || reservedRoom.equalsIgnoreCase("Single Bed"));

        while(true){
                while (!valid){
                    System.out.println("There is not such room called " + reservedRoom + " please enter valid room");
                    reservedRoom = scan.nextLine();
                    valid = (reservedRoom.equalsIgnoreCase("King Bed") || reservedRoom.equalsIgnoreCase("Queen Bed") || reservedRoom.equalsIgnoreCase("Single Bed"));

                }
            System.out.println("You reserved " + reservedRoom.toUpperCase());
            System.out.println("How many days are you gonna stay");
            int stayTime = scan.nextInt();
            if (reservedRoom.equalsIgnoreCase("King Bed")){
                bill = kingBed * stayTime;
                break;
            }

            if (reservedRoom.equalsIgnoreCase("Queen Bed")){
                bill = queenBed * stayTime;
                break;
            }

            if (reservedRoom.equalsIgnoreCase("Single Bed")){
                bill = singleBed * stayTime;
                break;
            }
           // valid = (reservedRoom.equalsIgnoreCase("King Bed") || reservedRoom.equalsIgnoreCase("Queen Bed") || reservedRoom.equalsIgnoreCase("Single Bed"));
           // (!(reservedRoom.equalsIgnoreCase("King bed") || reservedRoom.equalsIgnoreCase("Queen bed") || reservedRoom.equalsIgnoreCase("single bed")))
        }



        System.out.println("Thank you for your purchase , your bill is " + bill + "$ for " + reservedRoom.toUpperCase() + " have a nice stay");







    }
}