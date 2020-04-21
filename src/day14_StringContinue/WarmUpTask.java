package day14_StringContinue;


import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("Enter your first words");
        String word1 = input.next();

        System.out.println("Enter the second word");
        String word2 = input.next();


        String result = word1.concat(" "+
                word2).concat(" "+word2).concat(word1);
        System.out.println(result);




















    }
}
