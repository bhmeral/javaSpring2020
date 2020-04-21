package Repl_it;

import java.util.Scanner;

public class repl_it_148_Methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter number");
        int num = inp.nextInt();
        next3(num);
    }



    public static void next3(int num){
        int next_1= num+1;
        int next_2= num+2;
        int next_3= num+3;
        System.out.println("next3 are: " + next_1+" "+next_2+" "+next_3);
    }
}
