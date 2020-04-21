package Repl_it;

import java.util.Scanner;

public class if_stament_burger_or_chicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String in = s.next();
        double price = 10.0;
        double soda = 2.0;
        if (in.equals("burger") || in.equals("chicken")) {
            System.out.println(price);
        }

        if (in.equals("soda")) {
            System.out.println(soda);
        }
    }
}
