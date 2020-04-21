package Repl_it;

import java.util.Scanner;

public class repl_it_74_SMSmessage_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        String phoneNumber = message.substring((message.indexOf("[")+1),message.indexOf("]"));
        String messageBody = message.substring((message.indexOf("{")+1),message.indexOf("}"));


        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);

    }
}
