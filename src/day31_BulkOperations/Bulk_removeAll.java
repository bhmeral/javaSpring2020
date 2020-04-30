package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,3,7,8,9,1,3,33));
            // remove 1,3,5,8
/*
        Integer a = 1;
        list.remove(a);
        list.remove(a);

        Integer b = 3;
        list.remove(b);
        list.remove(b);
*/
       // list.removeAll(Arrays.asList(3));
        Integer[] arr = {3,1,5,8};
        list.removeAll(Arrays.asList(arr));

        System.out.println(list);

        System.out.println("==========================================");
        String[]  names = {"Ahmed","John","Daniel","Ahmed"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        nameList.removeAll(Arrays.asList("Ahmed"));
        System.out.println(nameList);



    }
}
