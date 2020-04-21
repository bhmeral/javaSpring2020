package day14_StringContinue;

import java.util.Scanner;

public class credintials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         /*
        userName:cybertek
        passWord:cybertekSchool
         */

         String validusername = "cybertek";
         String validpassword = "cybertekSchool";


        System.out.println("Enter your username");
        String username = input.next();
        System.out.println("Enter your password");
        String password = input.next();

        if(username.equals(validusername) && password.equals(validpassword)){
            System.out.println("Logged In Succesfully");
        }else{
            System.out.println("Invalid Entry");
        }





















    }
}
