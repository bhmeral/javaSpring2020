package day29_Wrapper_Array_List;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {
        ArrayList<String> shopping_list = new ArrayList<>();
        shopping_list.add("Milk");
        shopping_list.add("Bread");
        shopping_list.add("Eggs");

        System.out.println(shopping_list);

        for (int i = 0; i < shopping_list.size(); i++) {
            System.out.print(shopping_list.get(i) + " ");
        }

        System.out.println();

        for (String each : shopping_list){
            System.out.println(each);
        }


    }
}
