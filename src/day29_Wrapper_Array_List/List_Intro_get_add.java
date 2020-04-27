package day29_Wrapper_Array_List;

import java.util.ArrayList;

public class List_Intro_get_add {
    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>(); // size : 0
                                    // add five elements, size : 5
                                    // remove two elements, size : 3
        scores.add(10);  // Autoboxing  size : 1
        scores.add(20);  // Autoboxing  size : 2
        scores.add(30);  // size : 3
        System.out.println(scores);

       Integer a1 = scores.get(2); // none
       int a2 = scores.get(2);     // unboxing
       double a3 = scores.get(2);  // unboxing
    }
}
