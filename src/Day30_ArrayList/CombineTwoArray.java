package Day30_ArrayList;

import java.util.ArrayList;

/*write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */
public class CombineTwoArray {
    public static void main(String[] args) {
    String [] arr1 = {"A", "B", "C"};
    String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i=0; i<arr1.length; i++){
            String eachElement = arr1[i];
            list.add(eachElement);
        }
        for (String each: arr2){
            list.add(each);
        }

        System.out.println(list);
    }
}
