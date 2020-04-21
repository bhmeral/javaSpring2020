package Repl_it;

import java.util.Scanner;

public class repl_it_139_Methods {
    public static void main(String[] args) {


            plus();
    }

        public static void plus(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1 = scan.nextInt();
            System.out.println("Enter second number:");
            int num2 = scan.nextInt();
            System.out.println(num1+=num2);
        }

}
