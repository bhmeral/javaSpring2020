package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {

       String str = "Cybertek";
        //           01234567

        char ch1 =  str.charAt(5);
        System.out.println(ch1); // t
        // System.out.println(ch1 == 'A');
               //          't' == 'A' ====> false

       // System.out.println(ch1 == 'T');
        //                  't' == 'T' ===> false

            int numberofletters =  str.length();
        System.out.println(numberofletters);

        System.out.println(numberofletters>250); // false

        String str2 = "Today is a great day to die";

        int maxIndexnum = str2.length() - 1 ;
        System.out.println(maxIndexnum);


        String s1 = "Cybertek";
                 s1 = s1.concat("School"); // "Cybertek School"
        System.out.println(s1); // s1 = Cybertek School


        String s2 = "Java";
        System.out.println(s2.concat(" is a programming language"));
        System.out.println(s2);

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1 = "Java is fun";
                r1.concat(", and it's easy");
        System.out.println(r1);
              r1 = r1.concat(", and it's easy");
        System.out.println(r1);

        String name = "CYBERTEK";
             name = name.toLowerCase();
        System.out.println(name);

        String name1 = "cybertek";
            name1 = name.toUpperCase();
        System.out.println(name1);

        String A1 = "                  Today is a great day";
            A1 = A1.trim();
        System.out.println(A1);




    }
}
