package day15ForLoop;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {


        String str = "Java";

        String revers1 = "" + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        System.out.println(revers1);

        String revers2 = str.substring(3) + str.substring(2,3) + str.substring(1,2) + str.substring(0,1);
        System.out.println(revers2);

    }
}
