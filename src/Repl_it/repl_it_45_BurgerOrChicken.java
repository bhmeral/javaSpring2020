package Repl_it;

import java.util.Scanner;

public class repl_it_45_BurgerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String in = s.next();
        float price1 = 10f;
        float price2 = 2f;

        if (in=="burger"|| in=="chicker"){
            System.out.println(price1);
        }
        if (in=="soda"){
            System.out.println(price2);
        }


    }
}
