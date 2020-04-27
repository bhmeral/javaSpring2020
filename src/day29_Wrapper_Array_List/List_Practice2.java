package day29_Wrapper_Array_List;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(13);
        numbers.add(12);
        numbers.add(11);
        numbers.add(14);

        Integer max = Integer.MIN_VALUE;
        for (Integer each : numbers){
            if (each>max) {
                max = each;
            }
        }
        Integer min = Integer.MAX_VALUE;
        for (Integer each : numbers){
            if (each<min){
                min = each;

            }
        }

        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
        System.out.println(numbers);

        System.out.println("==========================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        int maximum = max(list2);
        int minimum = min(list2);
        System.out.println("Max is: " + max);
        System.out.println("Min is: " + min);
    }








    public static int max(ArrayList<Integer> numbers){

        Integer max = Integer.MIN_VALUE;

        for (Integer each : numbers){
            if (each>max) {
                max = each;
            }
        }
        return max;
    }
    public static int min(ArrayList<Integer> numbers){
        Integer min = Integer.MAX_VALUE;

        for (Integer each : numbers){
            if (each<min){
                min = each;

            }
        }
        return min;
    }
}
