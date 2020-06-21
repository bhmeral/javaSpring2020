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
            System.out.println("Please Re-Enter");
            System.out.println("Enter username");
            inputname = input.next();
            System.out.println("Enter Password");
            inputpassw = input.next();
            if (inputname.equals(validusername) && inputpassw.equals(validpassword)){
                break;
            }


    }

        System.out.println("Logged In");



    }
}


