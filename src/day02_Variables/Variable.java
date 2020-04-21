package day02_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Variable {
    public static void main(String[] args) {
        /*
        declare variables:
            DataType variableName = Data;
         */

        byte l=4;
        byte w=2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        // byte num = 2.5; byte, short, int, long they only accept whole number
         // byte nu1 = 130; exceeds the range of byte

        short num3 = 1000;
       // short  num4 = 4000; exceeds the range of short
        System.out.println(num3); // 1000
        System.out.println( 12345); // by default compiler takes it as int primitive

        int n1 = 20000;
        int nu2 = 100000;
        System.out.println(nu2);

       // long n3 = 9999999999999 // out of int range. compiler by default it as int
        long n4 = 9999999999999l; // by adding l forcefully telleing the compiler that this is long data number
        System.out.println(n4);

         System.out.println(999999999l);
        long n5 = 19;
        // double > float > long > int > short > byte
        // int num = 7l; larger one cannot be assigned to smaller one
        // smaller one can be assigned to bigger one
    short s1 = 10;
    // byte b1 = s1; // short is larger than byte
    int i1 = s1;

    long nu = 1;


        System.out.println(3.5);
        double d1 = 3.5;

       //  float f1 = 4.5 // double primitive is larger than float primitive, cannot assigned

        float f2 = 5.5f;























}

        }





