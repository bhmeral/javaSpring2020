package OfficeHours.Practice_04_15_20_ArraysStr;

public class ForEachLoop {
    public static void main(String[] args) {
     /*
     for each loop:
                for(DataType variableName: ArrayName)
      */

        int[] arr = {1,2,3,4};

        for ( int eachNumber : arr){
           if (eachNumber==3){
               continue;
           }


            System.out.println(eachNumber);

        }

        System.out.println("====================================");


        int [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        for (int eachEvenNumber: arr2){
            if (eachEvenNumber%2==0){
                System.out.println(eachEvenNumber);
            }

        }


    }
}
