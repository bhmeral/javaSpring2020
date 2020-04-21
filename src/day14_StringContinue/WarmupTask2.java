package day14_StringContinue;

import java.util.Scanner;

public class WarmupTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first word");
        String firstword = input.next();
        firstword = firstword.substring(1);  // or firstword.substring(1, firstword.length() - 1)


        System.out.println("Enter second word");
        String secondword = input.next();
        secondword = secondword.substring(1); // or secondword.substring(1, secondword.length() - 1)

       String result = firstword.concat(secondword);
        System.out.println(result);




    }
}
