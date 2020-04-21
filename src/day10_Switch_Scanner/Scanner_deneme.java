package day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        boolean greaternumber = num1>num2 || num2>num1;


        if(greaternumber){
            System.out.println(num1 + " is greater than " + num2);
        }else{
            System.out.println(num2 + " is greater than " + num1);
        }



    }
}
