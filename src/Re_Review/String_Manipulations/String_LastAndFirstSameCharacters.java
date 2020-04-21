package Re_Review.String_Manipulations;

import java.util.Scanner;

public class String_LastAndFirstSameCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

       boolean same = word.charAt(0) == word.charAt(word.length()-1);


        System.out.println(same);


    }
}
