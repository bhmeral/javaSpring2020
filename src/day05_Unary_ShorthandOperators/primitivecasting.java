package day05_Unary_ShorthandOperators;

public class primitivecasting {
    public static void main(String[] args) {

        // implicit casting: done automatically
        int a = 10;
        long b = a;     //implicit casting is done automatically
            // b = 10L

        // int c = b; // b is still long datatype

        int a1 =100;
        long b1 = (long)a1;


        // explicit casting: casting larger primitive type to smaller primitive type

        int Inum = 100;
        byte Bnum = (byte)Inum;
        System.out.println(Bnum);
        short Snum = (short)Inum;


        // float Fnum = (float ) Dnum; // 5.5
        double Dnum = 5.5;

        float Fnum = (float)Dnum; // 5.5

        float fnum = (int)Dnum;  // 5.0
        // fnum = (int)5.5
        // fnum = 5 ;
        // fnum = 5.0
        System.out.println(fnum);

        double D1 = 10.5;
        long L1 = (long)D1;
        System.out.println(L1);

        float F1 = 60.5f;
        int I1 = (int)F1;
        System.out.println(I1);


        long largeNum = 9999999999L;
        int intnum = (int) largeNum;
        System.out.println(intnum); // it gives a different num because 9999999999 is out of int range

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        double d2 = ch2;
        System.out.println(d2);











    }
 }

