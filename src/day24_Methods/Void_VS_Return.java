package day24_Methods;

import java.util.Arrays;

public class Void_VS_Return {
    public static void main(String[] args) {


    int[] arr1= {1,2,3,10,14,15};

    int [] arr2 = {200,30,140,400,};

    int [] arr3 = {1000,3000,40000,134,};

      arr1 = sortDescending(arr1);
      arr2 = sortDescending(arr2);
      arr3 = sortDescending(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(arr1[0]);
    }

    public static int[] sortDescending(int[] arr){
        Arrays.toString(arr);
        int[] RevArr = new int[arr.length];
        /*
               i        l
        RevArr[0] = arr[3]
        RevArr[1] = arr[2]
        RevArr[2] = arr[1]
        RevArr[3] = arr[0]
         */


        int j = arr.length-1;
        for (int i=0; i<arr.length; i++){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }
}
