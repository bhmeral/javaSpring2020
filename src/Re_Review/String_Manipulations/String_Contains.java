package Re_Review.String_Manipulations;

import java.util.Scanner;

public class String_Contains {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();

        if (word.contains("ly")){
            System.out.println("really?");
        }else{
            System.out.println("Never mind");
        }


    }
}
