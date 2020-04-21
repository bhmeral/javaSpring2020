package day17_WhileLoops;

import java.util.Scanner;

public class TaskUserInfo2_MuhtarVersion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Username");
        String username = input.next();

        System.out.println("Enter Password");
        String password = input.next();

        boolean valid = username.equalsIgnoreCase("bm") && password.equalsIgnoreCase("bm3");

        int count = 1;

        while (!valid) {
            System.out.println("Wrong Credintial! Re-Enter");
            System.out.println("Re-Enter Username");
            username = input.next();
            System.out.println("Re-Enter Password");
            password = input.next();

            valid = (username.equals("bm") && password.equals("bm3") );

            count++;
            if (count == 3 && !valid) {
                System.out.println("Your account is locked");
                break;
            }


            }
            if (valid) {
                System.out.println("Logged In");
            }

    }
}