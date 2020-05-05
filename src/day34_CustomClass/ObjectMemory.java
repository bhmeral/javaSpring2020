package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {

    int i = 100; // instance variable

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list1 = list;

        list1.remove(2);
        System.out.println(list1);

        String str = new String("cybertek");
        String str2 = str;

          str = str.toUpperCase();

        System.out.println(str);
        System.out.println(str2);

        int a = 300;

    }
}
