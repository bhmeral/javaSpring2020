package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {


        String sentence = "My name is Baha";
            int num1 = sentence.indexOf(("B"));

        System.out.println(num1);

        String str2 = "Cybertek school is awesome";
        //             0123456789
            int firstS = str2.indexOf("s");
            int secondS = str2.indexOf("is") + 1;
            System.out.println(firstS);
        System.out.println(secondS);


        int maxIndenumber = "Cybertek".length() - 1 ; //18
        System.out.println(maxIndenumber);
    }
}
