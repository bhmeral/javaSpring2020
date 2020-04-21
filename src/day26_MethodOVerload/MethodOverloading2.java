package day26_MethodOVerload;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
            first method: print the sum of two numbers
            second method: print the sum of three numbers
            third method: print the sum of four numbers
     */

    public static void sum(int a ,int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c , int d){
        System.out.println(a+b+c+d);
    }



    public static void main(String[] args) {
        sum(3,45,5,4);
        sum(6,3,6);


        int [] arr1 = {3,2,1,};
        char[] arr2 = {'z','s','a'};
        double [] arr3 = {7.8,6.9,5.4,20.7};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3); // same method name , different parameter

    }


}
