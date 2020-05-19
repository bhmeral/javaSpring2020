package Repl_it;

import java.util.Scanner;

public class repl_it_84_ZombieAttack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;

       for (int i =inhabitants; i>=1; i--){
           System.out.println("Day " + day + " [" + inhabitants + "]");

           inhabitants /=2;
           day++;
           if (inhabitants==0){
               break;
           }
       }
        System.out.println("---- EXTINCT ----");
    }
}
