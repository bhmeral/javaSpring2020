package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Task_SecondMaximumAndSecondMinimum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,4,5,12,2,3,3,5,4,5,6,7,8,8,8));

        ArrayList<Integer> SMaxNoD = new ArrayList<>();
        ArrayList<Integer> SMinNoD = new ArrayList<>();

        for (int i=0; i<list.size(); i++){
           int frequency = Collections.frequency(list,list.get(i));
            if (frequency>1 && SMaxNoD.contains(list.get(i))){
                continue;
            }
            SMaxNoD.add(list.get(i));
        }

        for (int i=0; i<list.size(); i++){
            int frequency = Collections.frequency(list,list.get(i));
            if (frequency>1 && SMinNoD.contains(list.get(i))){
                continue;
            }
            SMinNoD.add(list.get(i));
        }

        System.out.println(list);
        Collections.sort(SMaxNoD);
        System.out.println(SMaxNoD.get(SMaxNoD.size()-2));
        Collections.sort(SMinNoD);
        System.out.println(SMinNoD.get(1));

/*
        SomeOnes Solution(Irina)
        public class SecondMaxAndMin {
            public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,23,21,90,34,56,67,21,45,90));
                System.out.println(SecondMax(list));
                System.out.println(SecondMin(list));
            }public static int SecondMax(ArrayList<Integer> list){
                Integer max1 = Collections.max(list);
                list.removeAll(Arrays.asList(max1));
                int max = Collections.max(list);
                return max;
            }
            public static int SecondMin(ArrayList<Integer> list){
                Integer min1 = Collections.min(list);
                list.removeAll(Arrays.asList(min1));
                int min = Collections.min(list);
                return min;
            }
*/
    }
}
