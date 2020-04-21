package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        /*
        for each loop: loop that's already been iterated
                        for(DataType variableName : ArrayName){
                         }
                         variable name represents each of of the data in the Array
                         DataType must match with each of the array datatype

                         number of execution time of the loop depends on the data structure Array
                         iteration is always starts from 0

                         when do we use it : whenever w
         */

        int nums [] = {1,2,3,4};

        for (int eachElement : nums){
            System.out.println(eachElement);
        }
        System.out.println(Arrays.toString(nums));

        String student [] = {"Muhtar","Asiya","Murodil"};

        for (String eachElement : student){

            System.out.println(eachElement);
        }

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        for (int each : arr1){
            if (each<5){
                continue;
            }
            System.out.print(each);
        }

        System.out.println("============================================");
        String sentence = "I like Java";
       String [] reverse = sentence.split(" ");

       String result = "";


        for (int i=reverse.length-1; i>=0 ; i-- ){
            String  eachwords = reverse[i];
            result += eachwords + " ";
        }
        System.out.println(result );
    }
}
