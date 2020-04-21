package day17_WhileLoops;

import java.util.Scanner;

public class TaskUserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String validusername = "bahameral";
        String validpassword = "bahameral123";

        System.out.println("Enter your username");
        String inputname = input.next();

        System.out.println("Enter your password");
        String inputpassw = input.next();

        boolean valid = validusername.equalsIgnoreCase(inputname) && validpassword.equalsIgnoreCase(inputpassw);

        while (!valid) {
            System.out.println("Wrong Input");

        if (!(validusername.equalsIgnoreCase(inputname))) {
            System.out.println("Enter your username");
            input.next();
        }
        if (!(validpassword.equalsIgnoreCase(inputpassw))) {
            System.out.println("Enter your password");
            input.next();
        }
        if (valid) {
            System.out.println("Logged In! Successfully.");
            break;
        }

    }
        if(valid){
         System.out.println("Logged In");
        }




    }
}


