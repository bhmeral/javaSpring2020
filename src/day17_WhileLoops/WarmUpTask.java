package day17_WhileLoops;

/*
write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will need 'for loop and if statement'

 */

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int MaxNumber = -999999999; // any number the user provided will be greater than this number
                            // first user entered variable will be initalized to MaxNumber
        int minNumber = 1999999999;

    for (int i=1; i<6; i++){ // i: 1,2,3,4,5
        System.out.println("Enter a number");
        int num = input.nextInt();


        if(num>MaxNumber){ // to compare each user inputs , and assign the maximum number
            MaxNumber = num;
        }

        if (num < minNumber) {
            minNumber = num;
        }
    }


        System.out.println("Maximum Number: " +MaxNumber);
        System.out.println("Minimum number: " +minNumber);






    }
}
