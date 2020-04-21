package day17_WhileLoops;

import java.util.Scanner;

public class While_Loop_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String result = input.next();

        boolean valid = result.equalsIgnoreCase("Yes") || result.equalsIgnoreCase("No");


        while (!valid) { // while the input is not yes or not , repeats the question
            System.out.println("Please Re-Enter");
            result = input.next();

           if (result.equalsIgnoreCase("Yes")||result.equalsIgnoreCase("No"))
                break;
        }
            if (result.equalsIgnoreCase("Yes")) {
                System.out.println("Entered Yes");
            }
            if (result.equalsIgnoreCase("No")) {
                System.out.println("Entered No");
            }

    }
}

