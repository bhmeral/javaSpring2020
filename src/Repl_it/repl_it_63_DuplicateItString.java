package Repl_it;

import java.util.Scanner;

public class repl_it_63_DuplicateItString {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        String duplicate = word1.substring(0) + word2.substring(0) + word2.substring(0) + word1.substring(0);

        System.out.println(duplicate);




    }
}
