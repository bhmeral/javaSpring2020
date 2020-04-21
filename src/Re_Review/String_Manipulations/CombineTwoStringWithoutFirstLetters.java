package Re_Review.String_Manipulations;

import java.util.Scanner;

public class CombineTwoStringWithoutFirstLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        String combined = word1.substring(1).concat(word2.substring(1));
        System.out.println(combined);



    }
}
