package day10_Switch_Scanner;

import java.util.Scanner;


public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner result = new Scanner(System.in);


        System.out.println("Enter your first number: ");
        byte num1 = result.nextByte();
        System.out.println("Enter your second number: ");
        byte num2 = result.nextByte();

        System.out.println("Them sum of those two number are: " + (num1+num2) );

        System.out.println("=========================================================");







    }
}
