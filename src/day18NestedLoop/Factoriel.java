package day18NestedLoop;

import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");
        int num = input.nextInt();
        int result = 1;

        while(num>0){
          result *= num;

            num--;
        }

        System.out.println(result);



    }
}
