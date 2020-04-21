package day21_MultiDimensionalArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int [] arr1D = {1,2,3};

        System.out.println(Arrays.toString(arr1D));

        int [][] arr2D = {arr1D , {1,2,3}};

        System.out.println(Arrays.deepToString(arr2D));

    }
}
