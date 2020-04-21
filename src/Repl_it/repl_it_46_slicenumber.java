package Repl_it;

import java.util.Scanner;

public class repl_it_46_slicenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");
        int num = input.nextInt();

        int digit1 = num/10000;
        int digit2 = (num%10000)/1000;
        int digit3 = (num%1000)/100;
        int digit4 = (num%100)/10;
        int digit5 = (num%10);

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
        System.out.println();
    }
}
