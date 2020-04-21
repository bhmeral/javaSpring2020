package day14_StringContinue;

import java.util.Scanner;

public class WarmUpTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        String middlecharacter = " ";
        int middlenumber = word.length() / 2;

        if (word.length() % 2 != 0) {
            middlecharacter += word.charAt(middlenumber);
        } else {
            middlecharacter = middlecharacter + word.charAt(middlenumber -1 )+ word.charAt(middlenumber);
        }
        System.out.println(middlecharacter);





    }

}