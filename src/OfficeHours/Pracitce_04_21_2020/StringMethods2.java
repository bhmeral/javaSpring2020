package OfficeHours.Pracitce_04_21_2020;

public class StringMethods2 {
    public static void main(String[] args) {

        //*****// isEmpty(): checks if the String is empty, returns boolean
        String str = "           ";
        boolean a1 =str.isEmpty();
        System.out.println(a1);
        boolean a2 = !str.isEmpty();
        System.out.println(a2);

        System.out.println("====================================================");


        //*****// equals(str): checks if the two string of texts are equal or not, returns boolean
       //*****// equalsIgnoreCase(str): checks if the two string of texts are equal or not(without case sensitivity), returns boolean

        String s1 = "cat";
        String s2 = new String("cat");
        String s3 = "Cat";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s1));
        System.out.println(s3.equalsIgnoreCase(s1));

        System.out.println("====================================================");


        //*****// contains(str): checks if the str is included in the string, returns boolean

        String sentence = "I like to learn Java";

        System.out.println(sentence.contains("Java"));

        String sentence2 = "Top 3 Viruses are: 1.Corona, 2.Hanta, 3.Ebola";
        System.out.println(sentence2.contains("java"));


        System.out.println("====================================================");


        //*****// startsWith(str): checks if the string started with given str
        //*****// endsWith(str): checks if the string ended with given str

        String webAddress = "www.amazon.com";
        System.out.println(webAddress.startsWith("www"));
        System.out.println(webAddress.startsWith("wwww"));


        String gmail = "CybertekSchool@gmail.com";
        System.out.println(gmail.endsWith("gmail.com"));
        System.out.println(gmail.endsWith("hotmail.com"));
        System.out.println(gmail.endsWith("mail.com"));
    }
}
