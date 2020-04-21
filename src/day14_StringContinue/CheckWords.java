package day14_StringContinue;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        System.out.println("Enter third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 =  word3.length();

        boolean allofthemsame = length1==length2 && length1==length3;
        boolean noneofthemsame = length1!=length2 && length1!=length3 && length2 != length3;


        if(allofthemsame){
            System.out.println("All words is the same length ");
        }else if(noneofthemsame){
            System.out.println("None of them are same length");
        }else{
            System.out.println("Sum of them have the same length");
        }




    }
}
