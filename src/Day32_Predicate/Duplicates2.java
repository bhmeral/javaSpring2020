package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","A","B","D","D"));


        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> result1 = new ArrayList<>();

        for (String each: list){
            int frequency = Collections.frequency(list,each);
            if (frequency>1){
                if (result.contains(each)){
                    continue;
                }
                result.add(each);
            }
        }
        for (String each : list){
            int frequency = Collections.frequency(list,each);
            if(frequency==1){
                result1.add(each);
            }
        }

        System.out.println(list);
        System.out.println(result);
        System.out.println(result1);



        /*
        for(int i=0; i<list.size(); i++){
        int count = Collections.frequency(list,list.get(i));
        if(count>1 && !result.contains(list.get(i)){
                result.add(list.get(i));

            }

        }

        System.out.println(result);


         */

    }
}
