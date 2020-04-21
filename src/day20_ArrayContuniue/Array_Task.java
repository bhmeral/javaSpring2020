package day20_ArrayContuniue;

import java.util.Arrays;

public class Array_Task {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {2,3,4,5};

        int[] arr3 = new int[arr1.length+arr2.length]; // can contain all the elements from array 1 to array 2


        for (int i=0; i<7; i++){

            if (i>=0 && i<=2){
                arr3[i] += arr1[i];
            }else if(i>=3 && i<7){
                arr3[i] += arr2[i-(arr2.length-1)];

            }

        }
        String result = Arrays.toString(arr3);
        System.out.println(result);

    }

}
