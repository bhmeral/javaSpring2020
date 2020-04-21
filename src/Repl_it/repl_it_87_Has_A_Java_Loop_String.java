package Repl_it;

import java.util.Scanner;

public class repl_it_87_Has_A_Java_Loop_String {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.substring(0,2).contains("j")){
            System.out.println(!exists);
        }else{
            System.out.println(exists);
        }

    }
}
