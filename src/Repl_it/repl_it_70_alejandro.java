package Repl_it;

import java.util.Scanner;

public class repl_it_70_alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.contains("alejandro")){
            System.out.println("read this mail");
        }else{
            System.out.println("don't read");
        }
    }

}
