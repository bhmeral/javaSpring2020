package day31_BulkOperations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods_equals_contains {
    public static void main(String[] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("D");
        list1.add("C");

       boolean r1 = list1.contains("C");
        System.out.println(r1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list1);
        Collections.sort(list2);

        boolean r2 = list2.equals(list1);
        System.out.println(r2);

        System.out.println("==============================");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> reversedList3 = new ArrayList<>();


        for (int i=list.size()-1; i>=0; i--){
           reversedList3.add(list.get(i));
        }

        System.out.println(reversedList3);
    }
}
