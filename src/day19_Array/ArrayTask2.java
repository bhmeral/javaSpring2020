package day19_Array;

import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[10];


        for (int i=0; i<names.length; i++){
            System.out.println("Enter your name");
            names[i] = input.nextLine();

        }

        for (int s=0; s<names.length; s++){
            System.out.print(" "+ names[s]);
        }

    }

}
