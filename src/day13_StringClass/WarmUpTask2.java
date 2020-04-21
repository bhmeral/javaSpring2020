package day13_StringClass;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your FullName");
        String name = input.nextLine();

        System.out.println("Enter Your Building Number");
        String bnumber = input.next();

        input.nextLine();

        System.out.println("Enter Your Street");
        String street = input.nextLine();

        System.out.println("Enter Your City");
        String city = input.nextLine();

        System.out.println("Enter Your State");
        String state = input.next();

        System.out.println("Enter Your Zipcode");
        int zipcode = input.nextInt();


        String shipping= "Ship To: " + name + "\n" + "\t" + "\t" + bnumber + " " + " " + street + "\n" +
               "\t  " + "\t  " +city + ", " + state + " " + zipcode;

        System.out.println(shipping);

    }
}
