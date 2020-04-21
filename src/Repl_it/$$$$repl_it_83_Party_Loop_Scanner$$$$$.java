package Repl_it;

import java.util.Scanner;

public class $$$$repl_it_83_Party_Loop_Scanner$$$$$ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guest_list = "";

        System.out.println("Please enter guest name:");
        String name = input.next();
        System.out.println("Do you want to enter new guest name:");
        String answer = input.next();



        while(answer.equalsIgnoreCase("Yes")){

            System.out.println("Please enter guest name:");
            String guest = input.next();

            System.out.println("Do you want to enter new guest name:");
            String answer2 = input.next();
            guest_list   += " ," + guest ;

            if(answer2.equalsIgnoreCase("No")){
                break;
            }

        }
        System.out.println("Guest's list: " + name + "," + guest_list);

    }

}
