package Repl_it;

import java.util.Scanner;

public class repl_it_67_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();
        String reverse = "";

        if (length==5){
            reverse = "" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1)+ word.charAt(0);
        }else if(length<5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }

        System.out.println(reverse);
    }
}
