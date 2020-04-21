package day20_ArrayContuniue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] months ={"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"};

        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempts = 1;

       while (num > 12 || num <=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempts++;

            if (attempts == 3 &&  (num > 13 || num <=0)){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
       }



        String result = months[num-1];
        System.out.println(result);




    }
}
