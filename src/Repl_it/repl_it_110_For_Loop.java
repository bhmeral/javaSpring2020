package Repl_it;

import java.util.Scanner;

public class repl_it_110_For_Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int j=0; j<n; j++){
            System.out.print("*");
        }

    }
}
