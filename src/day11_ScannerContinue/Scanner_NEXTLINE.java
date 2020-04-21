package day11_ScannerContinue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner_NEXTLINE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your quote");
        String quote = input.nextLine();
        System.out.println("Jarvan: " + quote);



    }
}
