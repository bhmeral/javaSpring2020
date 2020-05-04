package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        // write a program that can return the unique objects from ArrayList of characters

        Character[] chars = {'A','A','A','B','B','C','D'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));

        ArrayList<Character> unique = new ArrayList<>();

        for (int i=0; i<charList.size(); i++){
          int frequency = Collections.frequency(charList,charList.get(i));
          if (frequency>1){
              continue;
          }
          unique.add(charList.get(i));
        }
        System.out.println(unique);


        /*
        for(Character each : charList
        int frequency = Collections.frequency(charList,each);
        if(frequency>1){
        continue;
        }
        unique.add(each);
        System.out.println(unique);
         */
    }
}
