package Repl_it;

import java.util.Scanner;

public class repl_it_35_Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word1 = input.next();
        String word2 = input.next();

        if(word1==word2){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }

    }
}
