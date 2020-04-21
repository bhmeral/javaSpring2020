package day11_ScannerContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_NEXTLINE_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your fullname:");
        String fullname = input.nextLine();

        System.out.println("Person's Age: " + age);
        System.out.println("Person's FullName is: " + fullname);











    }
}
