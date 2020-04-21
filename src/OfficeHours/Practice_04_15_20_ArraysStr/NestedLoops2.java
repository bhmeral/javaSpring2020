package OfficeHours.Practice_04_15_20_ArraysStr;

import java.util.Arrays;

public class NestedLoops2 {
    public static void main(String[] args) {

        int[][]  numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20},
        };

        for (int i=0; i<numbers.length; i++){  // i: index num's of 1D arrays
            for (int k=0; k<numbers[i].length; k++){ // k: index num's of elements
                System.out.println(numbers[i][k]);
            }

        }

        System.out.println("=====================================================");


        for (int[] each1DArray: numbers){
            for (int eachElement :each1DArray){
                if (eachElement%2!=0){
                    continue;
                }
                System.out.print(eachElement + " ");
            }
        }

    }
}
