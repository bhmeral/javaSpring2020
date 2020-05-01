package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

        /*
        write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
         */

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));

        ArrayList<String> Duplicates = new ArrayList<>();


     for (int i=0; i<list.size(); i++){
         int count = 0;
         for (String each : list){
             if (each.equals(list.get(i))){
                 count++;
             }
         }
         if (count>1&&!Duplicates.contains(list.get(i))){
             // if the frequency is greater than one, and if it's not contained in duplicates yet, then we will add the object
                Duplicates.add(list.get(i));
         }
     }

        System.out.println(list);
        System.out.println(Duplicates);


    }
}