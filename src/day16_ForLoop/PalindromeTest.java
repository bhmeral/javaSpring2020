package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String word = input.nextLine(); //Java
                                        //0123
        String reverseword = "";

            for( int i = word.length() -1; i>=0; i--){
               reverseword += word.charAt(i);
            }
       // System.out.println(reverseword);


        boolean palindrome = word.equalsIgnoreCase(reverseword);
        System.out.println(palindrome);
    }
}
