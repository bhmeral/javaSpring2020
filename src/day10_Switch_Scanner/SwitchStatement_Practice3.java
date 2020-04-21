package day10_Switch_Scanner;

import java.sql.SQLOutput;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {


        char letter = 'a';
        String result = "";
        switch (letter){
            case 'a':
              //  System.out.println("A");
                result = "A";

            case 'b':
               // System.out.println("B");
                result = "B";
                break;
            case 'c':
               // System.out.println("C");
                result = "C";
                break;
            case 'd':
                //System.out.println("D");
                  result = "D";
            default:
                System.out.println("Invalid Letter");
        }
        System.out.println(result);







    }
}
