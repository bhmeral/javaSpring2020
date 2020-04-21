package Re_Review.String_Manipulations;

import java.util.Scanner;

public class MiddleCharacterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        String middle_character = "";
        int middle_number = word.length() / 2;


        if (word.length() % 2 != 0){
            middle_character += (word.charAt(middle_number));
        }else{
           middle_character += middle_character + word.charAt(middle_number - 1) + word.charAt(middle_number);
        }

        System.out.println(middle_character);


    }
}
