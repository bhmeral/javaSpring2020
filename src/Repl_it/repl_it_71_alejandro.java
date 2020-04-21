package Repl_it;

import java.util.Scanner;

public class repl_it_71_alejandro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        boolean alejandro = a.contains("alejandro");
        boolean project = a.contains("project");

        if (alejandro&&project){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }
    }
}
