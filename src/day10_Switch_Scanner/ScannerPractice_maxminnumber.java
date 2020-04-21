package day10_Switch_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice_maxminnumber {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = scan.nextInt();
        System.out.println("Enter your third number:  ");
        int num3 = scan.nextInt();

        boolean maxnum1 = num1>num2 && num1>num3;
        boolean maxnum2 = num2>num1 && num2>num3;
        boolean maxnum3 = num3>num1 && num3>num2;


        int max = (maxnum1)? num1  : (maxnum2)? num2  : num3 ;


        System.out.println("Maximum number is:" + max);




    }
}
