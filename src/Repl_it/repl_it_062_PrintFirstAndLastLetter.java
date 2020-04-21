package Repl_it;

import java.util.Scanner;

public class repl_it_062_PrintFirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char letter1 = word.charAt(0);
        char letter2 = word.charAt(word.length()-1);

        String str = letter1 + letter2 + "";

        System.out.println(letter1+""+letter2);
    }
}
