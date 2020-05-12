package day37_Constructor;

import java.util.*;

import  static  day37_Constructor.Data.staticVariable;

import  static  day37_Constructor.Data.staticMethod;

public class ImportStatements {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Arrays.sort(arr);

        staticMethod();

        System.out.println(staticVariable);
    }
}
