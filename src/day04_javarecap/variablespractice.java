package day04_javarecap;

public class variablespractice {
    public static void main(String[] args) {
        // DataType variableName = Data

        byte num1 = 5;
        short num2 = num1;  //double > float > long > short > byte

        // byte num3 =num2;

        int num4=num2;  // int is preferred by complier

        long num5 =9999999999999l;

        float num6 = 100L;
        System.out.println(num6); //100.0
        // 1. 100 , 2.100L , 3.100.0

        float num7 = 0.5f;
        System.out.println(num7); // 0.5

        double num8= 0.5f;
        double num9= 99999999L;
        double num10= 100.5;
        System.out.println(num10);



        char ch1= 'a';
        System.out.println(ch1);
         char ch2= 65000;
        System.out.println(ch2);

        int a1 = '8';
        System.out.println(a1);

        int a2= 'z';
        System.out.println(a2);

        double d1 = 'z' + '8'; //z8, 178, 178.0
        System.out.println(d1);

        char ch3=178;
        System.out.println(ch3);

        char ch4= 'z' + '8';
        System.out.println(ch4);

        boolean c1= true;
        boolean c2= false;

        System.out.println( 9>10); // false

        System.out.println(9>=10); //true

        System.out.println(9!=10); //true

        System.out.println('a'=='b');   //false

        System.out.println('a'=='b' -1);    //true

        // System.out.println('a'=="a"); both data must be matching when we apply
        // '' does not match ""


        System.out.println('a'=='b'-1);
                //         97 == 98-1  true


        boolean r1 = !true; //false
        System.out.println(r1); //false
        System.out.println(!r1); //true


        System.out.println( !true==false);     //true

        System.out.println( !true != !false); //true






    }
}
