package OfficeHours.Practice_04_15_20_ArraysStr;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        int a = 100;
        int [] arr = {100,200,300};

        System.out.println(arr[1]); // 200

        System.out.println("=======================================");

        for (int i =0; i<3; i++){ // i: index num of elements
            // System.out.println(i);
            int num = arr[i];
            System.out.println(num);
        }

        System.out.println("========================================");

        int j = 0;
        while(j<3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }

        System.out.println("===========================================");

        String[] names = {"John","Aaron","Lucian"};
        int length = names.length;
        String [] namesREv = new String[length]; // {

        /*      l          k
        namesREv[0] = names[2];
        namesREv[1] = names[1];
        namesREv[2] = names[0];

         */

        /*


        int k = length-1;

        for (int i=0; i<length; i++){
            namesREv[i]=names[k];
            k--;
        }
      */

        int i = 0;
        int k = length-1;
        while(i<length){

            namesREv[i]=names[k];
            i++;
            k--;
        }




        System.out.println(Arrays.toString(namesREv));

    }

}
