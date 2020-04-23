package day27_DateTime;

public class Find_Minimum_Max {

    public static void main(String[] args) {
        int[] arr = {-5, -4, -7, -8, -10, -13, -1, -3};
/*
        for (int each : arr){
            if (each<minimum){
                minimum = each;
            }
        }
        System.out.println(minimum);
*/
        double[] arr1 = {-5, -4, -7, -8, -10, -13, -1, -3};

        int Min = Min(arr);
        int Max = Max(arr);
        double MinDouble = Min(arr1);
        System.out.println(MinDouble);
        System.out.println(Max);
        System.out.println(Min);

    }

    public static int Min(int[] arr) {
        int minimum = arr[0];


        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        return minimum;

    }

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }

        return max;
    }

    public static double Min (double [] arr){
        double minimum = arr[0];
        for (double i = 0.0; i < arr.length; i++) {
            if (minimum > arr[(int)i]) {
                minimum = arr[(int)i];
            }
        }
        return minimum;


    }


}
