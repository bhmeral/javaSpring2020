package day20_ArrayContuniue;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
         int[] arr1 = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: " + arr1[0]);
        System.out.println("Second min number is: " + arr1[1]);
        System.out.println("First max number is: " + arr1[arr1.length-1]);
        System.out.println("Second max number is: " + arr1[arr1.length-2]);

        char [] ch = {'Z','A','B','W','Y','D'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));


        String [] names = {"Deniz", "Osman", "Rustem", "Ali"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("============================================================");
        int[] arr = {3,1,4,-1,100,-100,200,155};
        int[] arrDes = new int [arr.length]; // [0,0,0,0,0,0,0,0]
        Arrays.sort(arr);  // [3,1,4,-1,100,-100,200,155]



        System.out.println(Arrays.toString(arr));

        int j = 0;

        for (int i = arr.length-1; i>=0; i--){
           // System.out.println(arr[i] + " ");
           arrDes[j]  = arr[i];
           j++;
        }

        System.out.println(Arrays.toString(arrDes));

    }
}
