package day24_Methods;

import java.util.Arrays;

public class returnMethods_Practice {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 231, 4, 5, -12};
        int max = maxNumber(arr);
        System.out.println("Max number is: " + max);
        int min = minNumber(arr);
        System.out.println("Min number is: " + min);
    }


    public static int maxNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static int minNumber(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }


}