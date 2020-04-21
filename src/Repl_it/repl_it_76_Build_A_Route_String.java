package Repl_it;

import java.util.Scanner;

public class repl_it_76_Build_A_Route_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start.startsWith("A")&&end.endsWith("D")){
            System.out.println("right > down > left:" + end + " found");
        }else if (start.startsWith("A")&&end.endsWith("B")){
            System.out.println("right: " + end + " found");
        }else if (start.startsWith("A")&&end.endsWith("C")){
            System.out.println("right > down :" + end + " found");
        }else if (start.startsWith("B")&&end.endsWith("C")){
            System.out.println("down: " + end + " found");
        }else if (start.startsWith("B")&&end.endsWith("D")) {
            System.out.println("down > left: " + end + " found");
        }else if (start.startsWith("B")&&end.endsWith("A")){
                System.out.println("down > left > up: " + end + " found");
        }else if (start.startsWith("C")&&end.endsWith("D")) {
            System.out.println("left: " + end + " found");
        }else if (start.startsWith("C")&&end.endsWith("A")) {
            System.out.println(" left > up: " + end + " found");
        }else if (start.startsWith("C")&&end.endsWith("B")) {
            System.out.println("left > up > right: " + end + " found");
        }else if (start.startsWith("D")&&end.endsWith("A")) {
            System.out.println("up: " + end + " found");
        }else if (start.startsWith("D")&&end.endsWith("B")) {
            System.out.println("up > right: " + end + " found");
        }else if (start.startsWith("D")&&end.endsWith("C")) {
            System.out.println("up > right > down: " + end + " found");
        }else{
            System.out.println(start + " found");
        }

    }


}
