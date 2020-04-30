package OfficeHours.Practice_04_29_20;

import java.util.ArrayList;

public class ArrayList_Methods {

/*
            ArrayList: does not support primitive
            add(), get(), size(), set(), remove(), clear(), indexOf(), lastIndexOf()
 */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
                list.add(10);
                list.add(20);
                list.add(1,30);

        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.get(1));



        ArrayList<String> list2 = new ArrayList<>();
                    list2.add("A");
                    list2.add("B");
                    list2.add("C");
                    list2.add("D");

          list2.add(2,"E");

          System.out.println(list2);
          System.out.println("=====================");
          for (int i=0 ; i<list2.size(); i++){
             String  each = list2.get(i);
             System.out.print(each+" ");
          }
          System.out.println();
          System.out.println("=====================");
          /*
          for (String each : list2){
              System.out.println(each);
          }
           */

            list2.set(3,"F");

         System.out.println(list2);
        System.out.println("=====================");

            list2.remove("F");

        System.out.println(list2);
        System.out.println("=====================");

        System.out.println("=====================");

        ArrayList<Character> list1 = new ArrayList<>();
                list1.add('A');
                list1.add('B');
                list1.add('C');
                list1.add('D');
                list1.add('C');

                int indexNum = list1.indexOf('C');
                System.out.println(indexNum);
                int lastIndexNum = list1.lastIndexOf('C');
                System.out.println(lastIndexNum);

                Character ch1 = 'C';
              //  list1.remove(ch1); remove the first 'C'
                   list1.remove(list1.lastIndexOf('C'));


                System.out.println(list1);

        System.out.println("======================================");
         int [] arr1 = {1,2,3,4,5};
         int [] arr2 = {6,7,8,9,10,11,12,13};

         ArrayList<Integer> list3 = new ArrayList<>();


         for (int i=0 ; i<arr1.length; i++){
             list3.add(arr1[i]);
         }
         for (int i=0; i<arr2.length; i++){
             list3.add(arr2[i]);
         }

         for (int each: arr1){
             list3.add(each);
         }

         for(int each: arr2){
             list3.add(each);
         }


        System.out.println(list3);

    }

}
