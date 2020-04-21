package day20_ArrayContuniue;

import java.util.Arrays;

public class Array_Chart {
    public static void main(String[] args) {
        String str = "Batch 18";

       char [] ch = str.toCharArray();


        System.out.println(Arrays.toString(ch));

        System.out.println("===================================================");

        String name = "Muhtar";
        char [] chx = name.toCharArray();
        System.out.println(Arrays.toString(chx));

        System.out.println("===================================================");

        String str1 = "Cybertek School";
        String str2 = "Cybertek School";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);


        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        System.out.println(Arrays.equals(ch1,ch2));

    }
}
