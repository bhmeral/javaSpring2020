package Repl_it;

import java.util.Scanner;

public class $$$$$repl_it_64_MiddleOneString$$$$$ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String middleCharacter = "";

        int middleNumber = word.length()/2;

        if (middleNumber%2!=0){
            middleCharacter += word.charAt(middleNumber);
        }else{
            middleCharacter += middleCharacter + word.charAt(middleNumber - 1 ) + word.charAt(middleNumber);
        }


        System.out.println(middleCharacter);

    }
}
