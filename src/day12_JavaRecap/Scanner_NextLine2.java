package day12_JavaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println(num);

        input.nextLine(); // Enter

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println(name);






    }
}
