package Re_Review.String_Manipulations;

import java.util.Scanner;

public class String_CheckingWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word");
        String word1 = input.next();
        System.out.println("Enter your second word");
        String word2 = input.next();
        System.out.println("Enter your third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();


        boolean allsame = length1==length2 && length1==length3;
        boolean nonesame = length1!=length2 && length1!=length3 && length2!=length3;

        if (allsame){
            System.out.println("All of them have the same length");
        }else if (nonesame){
            System.out.println("None of them  have the same length");
        }else{
            System.out.println("Some of them have the same length");
        }



    }
}
