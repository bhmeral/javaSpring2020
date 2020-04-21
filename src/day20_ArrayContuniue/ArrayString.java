package day20_ArrayContuniue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

       String str = Arrays.toString(arr);
        System.out.println(str); // Array must be converted to string before we print

        // overloaded

        String [] names = {"Madina","Fatih","Osman"};

        System.out.println(Arrays.toString(names));

        double [] nums = {10,20,30,40,50};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]);


    }
}
