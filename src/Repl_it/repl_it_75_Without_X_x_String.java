package Repl_it;

import java.util.Scanner;

public class repl_it_75_Without_X_x_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();



        if (word.startsWith("x")||word.startsWith("X") || word.endsWith("x") || word.endsWith("X") ){
          word =  word.replace("x","");
          word = word.replace("X","");
            System.out.println(word);
        }else{
            System.out.println(word);
        }

    }
}
