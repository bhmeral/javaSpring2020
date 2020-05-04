package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Extracting_Lambda {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

        char [] arr = str.toCharArray();
        Character [] ch = new Character[arr.length];
        for (int i=0; i<arr.length; i++){
            ch[i] = arr[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(C -> !Character.isLetter(C));
        System.out.println(letters);
        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(C -> !Character.isDigit(C));
        System.out.println(digits);
        ArrayList<Character> specialCharacter = new ArrayList<>(Arrays.asList(ch));
        specialCharacter.removeIf(C -> (Character.isDigit(C)||Character.isLetter(C)));
        System.out.println(specialCharacter);



    }
}
