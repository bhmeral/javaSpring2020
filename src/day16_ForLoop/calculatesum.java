package day16_ForLoop;

import java.util.Scanner;

public class calculatesum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = input.nextInt(); // 100
        int sum = 0;
        for (int i = 1; i<=num; i++){

           sum+= i;
        }

        System.out.println(sum);






    }
}
