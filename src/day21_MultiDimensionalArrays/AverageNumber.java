package day21_MultiDimensionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");


        int[] arr = {1,2,2};
        // average: sum of al  numbers / length

        int length = arr.length; // total number of the elements
        int sum = 0;
        for (int i=0; i<=length-1; i++) {
            int each_number = arr[i] ;
            sum += each_number;
        }

        System.out.println(sum);

        double average = sum/(double)length;

        System.out.println(average);
        System.out.println(DF.format(average));


    }
}
