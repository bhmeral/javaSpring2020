package Repl_it;

import java.util.Scanner;

public class $$$$repl_it_91_CountHi_Loop_String$$$ {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int hi_count = 0;


        while(str.contains("hi")){
            hi_count++;
           str = str.replaceFirst("hi"," ");
        }


        System.out.println(hi_count);


    }
}
