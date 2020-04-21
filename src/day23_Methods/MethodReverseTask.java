package day23_Methods;

import java.util.Scanner;

public class MethodReverseTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name my comrade");
        String word = scan.next();
        Reverse(word);
    }




    public static void Reverse(String word){


        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));

            }
        }
    }

