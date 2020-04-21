package day13_StringClass;


public class String_Literal_practice {
    public static void main(String[] args) {

        String str1 = "CAT"; // String Pool
        String str2 = new String("CAT"); //Java Heap

        System.out.println(str1 + " : " + str2);
        System.out.println(str1 == str2); // two different object , false

        String str3 = "CAT"; // String Pool

        System.out.println(str1 == str3);

        String str4 = new String("CAT");
        System.out.println(str2==str4);

        String s1 = "JAVA"; //String Pool, immutable we cannot modify it
        s1 =   "JavaScript"; // new object will be created in memory

        System.out.println(s1);

        String s2 = "JAVA"; // no memory will be created in the memory


        System.out.println(s1==s2);
        //                       "JavaScript != "JAVA"









    }
}
