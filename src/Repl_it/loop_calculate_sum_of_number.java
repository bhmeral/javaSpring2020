package Repl_it;

import java.util.Scanner;

public class loop_calculate_sum_of_number {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = 0;


        for (int i=0; i<=n; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
