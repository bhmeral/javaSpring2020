package day20_ArrayContuniue;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};

        boolean equal = Arrays.equals(arr1,arr2);
        System.out.println(equal);

    }
}
