package OfficeHours.Pracitce_04_21_2020;

public class StringMethods {
    public static void main(String[] args) {

        //*****// charAt(indexNumber): returns the char at the given index, char primitive

        String str1 = "Java";
            //         0123
       char ch1 =  str1.charAt(3); // a
        System.out.println(ch1);

       // char ch2 = str1.charAt(4); out of range will give out of bound error

        System.out.println("=======================================================");

       //*****// length (): returns the total number of chars, int

        String str2 = "Cybertek School";
        int total = str2.length();

        System.out.println(total);

        int maxIndex = str2.length()-1;
        System.out.println(str2.charAt(maxIndex));

        //*****//concat(str): concatenation, returns new String
        String str3 = "Cybertek";
                    str3.concat("School");
        System.out.println(str3);
                str3 = str3.concat(" School");
        System.out.println(str3);

        String str4 = "Java";
                    str4.concat(" is fun");
        System.out.println(str4);
                str4 = str4.concat(" is fun");
        System.out.println(str4);

        System.out.println("=======================================================");

        //*****// toLowerCase() & toUpperCase(): change the case of the strings to upper or lower cases , returns new string

        String str5 = "CYBERTEK SCHOOL";
        str5 = str5.toLowerCase(); // "cybertek school"
        System.out.println(str5);

        String str6 = "cybertek school";
        str6 = str6.toUpperCase(); // "CYBERTEK SCHOOL"
        System.out.println(str6);

        System.out.println("=======================================================");

        //*****// trim(): removes unused(white) spaces from the string
        String str7 = "                  Cybertek";

        System.out.println(str7.length());

        str7 = str7.trim();
        System.out.println(str7);

        System.out.println("=======================================================");

        //*****// substring(beginning Index,ending Index): creates substring starting from beginning index till the ending index (ending index excluded)
        String sentence1 = "I like Java";
                    //       0123456789..

        String java = sentence1.substring(7,sentence1.length());
        String like = sentence1.substring(2,6);

        String like_java = java + like;

        System.out.println(java);
        System.out.println(like);
        System.out.println(like_java);

      //*****// substring(beginning index)
        String sentence2 = "I like to learn Java";
        //                  0123456789

        String r1 = sentence2.substring(10);
        System.out.println(r1);

     System.out.println("=======================================================");

     //*****// replace(old str, new str), replaces all the matching ones, returns new string
     String str = "I like C, C is cool";
     str = str.replace("C","Java");
     System.out.println(str);

     //*****// replaceFirst(old str, new str): replace the first matching one, returns new string
     String t1 = " Java is fun, Java is good";
     t1 = t1.replaceFirst("Java","C#");
     System.out.println(t1);

     System.out.println("=======================================================");

     //*****// indexOf(str):returns the index of first matching character, as an int
     String y1 = "Today W is Wednesday";
     int a1 = y1.indexOf("W");
     System.out.println(a1);
     int a2 = y1.indexOf("Wednesday");
     System.out.println(a2);

     //*****// lastIndexOf(str):
     String y2 = "Cybertek School, School";
     int a3 = y2.indexOf("S");
     int a4 = y2.lastIndexOf("S"); // last S' index number
     System.out.println(a3);
     System.out.println(a4);


    }

}
