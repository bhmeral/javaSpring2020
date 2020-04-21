package Repl_it;

import java.util.Scanner;

public class repl_it_69_PrintHalfTwiceString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       String result = word.substring(0,word.length()/2) + word.substring(0,word.length()/2);


        if (word.length()%2!=0){
       word = result;
        }else{
       word = result;
        }

        System.out.println(word);
    }
}
