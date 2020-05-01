package Day32_Predicate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        // max min
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));


        ArrayList<Integer> list1  = new ArrayList<>();
        //addAll
        list1.addAll(Arrays.asList(1,2,2,4,1,2,3,4,5));

        //replaceAll
        Collections.swap(list1,0,4);
        System.out.println(list1);
        Collections.replaceAll(list1,1,10);

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Omer","Omer","Omer","Sha","Fatih","Mary"));

        /*
        names.set(0,"Irina");
        names.set(1,"Irina");
        names.set(2,"Irina");
        */

        Collections.replaceAll(names,"Omer","Irina");

        System.out.println(names);
    }
}
