package day20_ArrayContuniue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] days = {"Monday", "Thursday","Wednesday","Tuesday","Friday","Saturday","Sunday"};

        System.out.println("Enter a number");
        int num = input.nextInt();
        int attempt = 1;


        while(num>7 || num<1){
            System.out.println("Invalid Entry Please Re-Enter");
            num = input.nextInt();
            attempt++;
            if (attempt == 3 &&  (num > 13 || num <=0)){
                System.exit(0);
            }
        }




        System.out.println(days[num-1]);






    }
}
