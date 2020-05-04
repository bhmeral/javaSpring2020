package Day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x%2!=0;

        ArrayList<Integer> list = new ArrayList<>();
            list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
            list.removeIf(oddNumber);
            System.out.println(list);

        System.out.println("==============================================");

        Predicate<Integer> lessThan5 = Y -> Y<5;

        list.removeIf(lessThan5);
        System.out.println(list);

        System.out.println("==============================================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Murtaza","Mohemmed","Borris","Sha","Bilal"));
        Predicate<String> remove = Y -> Y.startsWith("M");
        names.removeIf(remove);
        System.out.println(names);

        System.out.println("==============================================");

        Predicate<String> removeA_M = Z -> Z.startsWith("M")|| Z.startsWith("A");
        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar","Alex","Asiya","Dilnaz","Radu"));
        nameList.removeIf(removeA_M);
        System.out.println(nameList);

        System.out.println("==============================================");
        Predicate<Character> digits = C -> Character.isDigit(C);
        ArrayList<Character> chars = new ArrayList<>();
                chars.addAll(Arrays.asList('A','B','3','5','@'));
                chars.removeIf(digits);
                System.out.println(chars);


        System.out.println("==============================================");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nums.removeIf(p-> p>5);
        System.out.println(nums);


    }
}
