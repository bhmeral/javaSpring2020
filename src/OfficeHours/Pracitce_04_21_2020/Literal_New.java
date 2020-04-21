package OfficeHours.Pracitce_04_21_2020;

public class Literal_New {
    public static void main(String[] args) {

        String s1 = "Java"; // String Literal
        String s2 = "Java"; // String Literal
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1==s2); // true, same objects
        System.out.println(s1==s3); // false, different objects at different memory
        System.out.println(s3==s4); // false, different objects
    }
}
