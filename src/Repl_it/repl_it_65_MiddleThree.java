package Repl_it;

import java.util.Scanner;

public class repl_it_65_MiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int middle_number = word.length()/2;

        String middle_characters = "";


        if (word.length()%2!=0 && word.length()>=5){
            middle_characters += ""+word.charAt(middle_number-1) + word.charAt(middle_number) + word.charAt(middle_number+1);
        }else{
            System.out.println("Invalid");
        }

        System.out.println(middle_characters);



        int i = 0;

        while(i<101){
            System.out.println(i);
            i++;
        }

    }
}
