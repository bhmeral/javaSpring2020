package day24_Methods;

import java.util.Scanner;

public class String_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String reversed = Reverse(str );
    }





    public static String Reverse(String str){
        String reverse = "";
        for (int i=str.length()-1; i>=0; i--){
            reverse +=str.charAt(i);
        }

        System.out.println(reverse);
        return reverse ;
    }




}
