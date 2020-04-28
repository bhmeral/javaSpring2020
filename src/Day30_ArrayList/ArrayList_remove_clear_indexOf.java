package Day30_ArrayList;

import java.util.ArrayList;

public class ArrayList_remove_clear_indexOf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A"); //0
        list.add("B"); //1
        list.add("C"); //2



       // list.remove(1);
        String str = "B";
        boolean r1 = list.remove(str);
        boolean r2 = list.remove("A");
        System.out.println(list);
        System.out.println(r1);


        list.clear(); //{}
        System.out.println(list);
        System.out.println(list.size());

        System.out.println("============================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);   //0
        list2.add(1);   //1
        list2.add(2);   //2
        list2.add(3);   //3
        // {1,1,2,3}


        int num1 = list2.indexOf(1);
        // Integer = int   AutoBoxing
        System.out.println(num1);
        int num2 = list2.indexOf(100);
        System.out.println(num2);
    }
}
