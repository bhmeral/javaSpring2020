package Repl_it;

import java.util.Scanner;

public class repl_it_99_CountTriples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;

        for (int i = 0; i<str.length(); i++){
           char ch1 = str.charAt(i);
            char ch2 = str.charAt(i+1);
            char ch3 = str.charAt(i+2);
            if (ch1 == ch2 && ch2 == ch3){
                count++;
            }
        }
        System.out.println(count);

    }
}
