package day14_StringContinue;

import java.util.Scanner;

public class credintals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         /*
        userName:cybertek
        passWord:cybertekSchool
         */

        String validusername = "cybertek";
        String validpassword = "cybertekSchool";


        System.out.println("Enter your username");
        String username = input.nextLine();
        System.out.println("Enter your password");
        String password = input.nextLine();

        boolean loggedIN = username.equals(validusername) && password.equals(validpassword);
        boolean invalidusername = !username.equals(validusername) &&  password.equals(validpassword); // valid password invalid username
        boolean invalidpassword = !password.equals(validpassword) && username.equals(validusername);


        if(!username.isEmpty() && !password.isEmpty()){ // username and password are not empty
            if(loggedIN){
                System.out.println("Logged In");
            }else if(invalidusername){
                System.out.println("Password is correct, username is incorrect");
            }else if(invalidpassword){
                System.out.println("Username is correct, password is incorrect");
            }else{
                System.out.println("Both username name password are incorrect");
            }














        }else{
            System.out.println("You MUST enter username and password");
        }





    }
}
