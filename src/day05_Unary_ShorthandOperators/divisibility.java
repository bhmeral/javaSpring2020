package day05_Unary_ShorthandOperators;

import java.sql.SQLOutput;

public class divisibility {
    public static void main(String[] args) {

        int number =80;

        boolean divisibleby2 = number%2 ==0;
         // the number can be divided by 2 without any remainder
        boolean divisibileby3 = number%3 ==0;
        // the number can be divided by 3 without and remainder
        boolean divisibleby5 = number%5 ==0;
        // the number can be divided by 5 without and remainder
        String result1 = number + " is divisible by 2: " + divisibleby2;
        String result2 = number + " is divisible by 3: " + divisibileby3;
        String result3 = number + " is divisible by 5: " + divisibleby5;

        //System.out.println(result1);
        //System.out.println(result2);
        // System.out.println(result3);

        //System.out.println(result1 + "\n"+result2 + "\n"+result3);

        String finalResult = result1 + "\n"+result2 + "\n"+result3;

        System.out.println(finalResult );

    }
}
