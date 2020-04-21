package day19_Array;

public class Array_Intro {
    public static void main(String[] args) {
        /*
               3 data  structures
                    1. Array
                    2. Collection
                    3. Maps

              declaration:
                   DataType[] variableName = {dat1,dat2,dat3}
                            //   index           1   2    3
        [] can be placed either after data_type or variable_name

        */



        // int scores =  90,10,20; regular variables can only have on data

        int[] score = {100,95,90,85,70};
                //      0   1  2  3  4
        // retrieve: variable_Name[index]

        int num1 = score[2];// int
        int num2 = score[0];
        int num3 = score[3];

        String[] name = {"nameA","nameB","nameC","nameD"};

        String name1 = name[0];
        String name2 = name[1];
        String name3 = name[2];

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("====================================================================");

        System.out.println(name1 + " Score: " + num1);
        System.out.println(name2 + " Score: " + num2);
        System.out.println(name3 + " Score: " + num3);





    }
}
