package day24_Methods;

import Resources.Library;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Cybertek";

      String Revstr =  Library.Reverse(str);

        System.out.println(Revstr.equalsIgnoreCase(str));

        int[] arr = {100,200,300,400000,5000,404040};
        arr  = Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));
    }


}
