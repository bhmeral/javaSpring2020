package Repl_it;

public class repl_it_166_Methods_with_String1_mergethem {
    public static String mergeStrings(String one, String two){

        String s1 = "123";
        String s2 = "abc";
        int  merge = s1.length()+s2.length();
        String merged = "";

        int i = 0;
        while(i<merge){

            merged += "" + s1.charAt(i) +  s2.charAt(i);

            i++;
        }

        return merged;
    }

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "abc";
     String result =  mergeStrings(s1,s2);
        System.out.println(result);
    }
}
