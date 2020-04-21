package Repl_it;

import java.util.Scanner;

public class repl_it_158_Methods {
    public static boolean isEven(int n){
        if (n%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean  result  = isEven(n);
        System.out.println(result);
    }


}
