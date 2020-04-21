package OfficeHours.Practice_04_15_20_ArraysStr;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        /*
        Arrays.sort(): sort the array in Ascending order
        Arrays.toString(): converts single dimensional array to string

        Arrays.deepToString(): converts multi dimensional array to string
        Arrays.equal(arr1,arr2): arr1==arr2
         */

        int[] arr = {9,5,3,21,56,5,7};

        Arrays.sort(arr); // [3, 5, 5, 7, 9, 21, 56]

        System.out.println(Arrays.toString(arr));

        int[] salaries = {  123133, 1231231,2223331,4567,128 };
        int length = salaries.length;
        int lastIndex = length-1;
        Arrays.sort(salaries); // ascending

        System.out.println("Minimum salary: " + salaries[0]);
        System.out.println("Maximum salary: " + salaries[length-1]);

        System.out.println("=========================================");
        int[] arr1 = {3,2,1};



    }
}
