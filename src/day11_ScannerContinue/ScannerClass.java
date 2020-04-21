package day11_ScannerContinue;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

        System.out.println("Enter a long number:");

        long a = scan.nextLong();
        System.out.println("You have entered:" +a);

        System.out.println("Enter a decimal:");
        float b =  scan.nextFloat();
        System.out.println("You have entered:"+ b);

        System.out.println("Enter a decimal:");
        double c = scan.nextDouble();
        System.out.println("You have entered:" + b);


        System.out.println("Enter true or false");
         boolean bool = scan.nextBoolean();

        System.out.println("Enter your sentence");
        String str = scan.next();
        System.out.println("You have entered: " +str);
    }
}
