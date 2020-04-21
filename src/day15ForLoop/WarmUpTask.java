package day15ForLoop;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String name = input.next();

        System.out.println("Enter your second name");
        String surname = input.next();

/*
String initials = name.substring(0,1) + surname.substring(0,1);
        initials = initials.toUpperCase();

 */

        String initials = name.charAt(0)+ " " +surname.charAt(0);

        System.out.println(initials);








    }
}
