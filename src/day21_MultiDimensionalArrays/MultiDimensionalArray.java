package day21_MultiDimensionalArrays;

/* a variable that can contain arrays
 n dimensional array MUST contain(n-1) dimensional array
 2 dimensional



 */


import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,};

        int [][] arr2D = { arr,{4,5,6} };
                //         0
        System.out.println(arr2D.length);

        int[] arr1D = arr2D[1];

        System.out.println(Arrays.toString(arr2D[1]));


        

    }
}
