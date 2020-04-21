package Repl_it;

import java.util.Scanner;

public class $repl_it_72_Email_1_String$ {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String name = email.substring(1,email.indexOf("_"));
        String surname = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        if (email.contains("_")){
            email =  surname + "_" + name + "@gmail.com";
            System.out.println(email);
        }else{
            System.out.println(email);
        }
    }
}
