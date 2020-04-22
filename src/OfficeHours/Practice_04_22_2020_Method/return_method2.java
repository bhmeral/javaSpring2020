package OfficeHours.Practice_04_22_2020_Method;

import java.util.Arrays;

public class return_method2 {
    // write a return method that can return the second maximum number from an int array
    public static void main(String[] args) {
        int [] arr = {100,40,500,40,50,200,80};
        int result =  SecondMax(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result);

    }

    public static int SecondMax(int[] arr){
        Arrays.sort(arr);


        return (arr[arr.length-2]);

    }

}
