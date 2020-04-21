package day13_StringClass;

import java.util.Scanner;

public class StringManipulationsTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your First and Last Name");
        String firstandlastname = input.nextLine();


        String firstName = firstandlastname.substring(0,1);
        String lastName = firstandlastname.substring(firstandlastname.indexOf(" ") + 1);

        firstName = firstName.substring(0,1).toUpperCase();
        lastName = lastName.substring(0,1).toUpperCase();



        System.out.println("Your Initials are : " +  "\n"+ firstName + lastName);




    }
}
