package day29_Wrapper_Array_List;

import java.util.Arrays;

public class Value_Of {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str); // Integer , 123
        System.out.println(a);

        double b = Integer.valueOf(str); // unboxing
        System.out.println(b);
        // double = Integer


        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);
        // double = double  none

        double d2 = Double.valueOf(str2);
        // double = Double

        System.out.println(d1); // 15.5
        System.out.println(d2); // 15.5

        System.out.println(d1 == d2);

        System.out.println("==========================================================");

        int z1 = 2000;
       // Long L1 = z1; does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;

        String r1 = "True";
        Boolean t1 = Boolean.valueOf(r1); // Boolean,true
                    // Boolean = Boolean none
        boolean t2 = Boolean.valueOf(r1); // Boolean,true
        // boolean = Boolean 000 unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("===================================================");
        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNUm = Integer.MIN_VALUE;
        System.out.println(minNUm);


        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);

        byte minNum3 = Byte.MIN_VALUE;
        System.out.println(minNum3);

        System.out.println("===================================================");

        double[] arr = new double[3];
            System.out.println(Arrays.toString(arr));
        Boolean [] arr2 = new Boolean[3];
            System.out.println(Arrays.toString(arr2));
        Integer[] arr3 = new Integer[3];
            System.out.println(Arrays.toString(arr3));
    }
}
