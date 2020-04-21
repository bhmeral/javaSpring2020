package day14_StringContinue;

public class StringManipulations3 {
    public static void main(String[] args) {

        String st1 = "CYBERTEK";
        String st2 = "cybertek";

        System.out.println(st1.equals(st2)); //false
        System.out.println(st1.equalsIgnoreCase(st2)); //true, ignores the case sensitivity.


        String s1 = "Cybertek School";
       boolean contain =  s1.contains("School");

        System.out.println(contain);


        String s3 = "United States";
        System.out.println(s3.startsWith("U"));  // True




















    }
}
