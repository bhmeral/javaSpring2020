package Repl_it;

import java.util.Scanner;

public class $$$repl_it_79_String_no_end_String_method$$$ {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        int lastIndex = txt.length()-1;
        txt = txt.substring(0,lastIndex);
        System.out.println(txt);
    }

}
