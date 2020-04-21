package Repl_it;

import java.util.Scanner;

public class repl_it32 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter seconds:");
        int seconds = input.nextInt();

        int wholehour = seconds/3600;
        int wholeminutes = seconds/60;
        int wholeseconds = seconds%60;



        String result = wholehour + " hours, " + wholeminutes + " minutes," ;
        System.out.println(result);






    }
}
