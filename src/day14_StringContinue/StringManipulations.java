package day14_StringContinue;

public class StringManipulations {
    public static void main(String[] args) {

        String str = "I like to learn Java. I like to watch the movie LOTR";

           int num = str.indexOf(" I" + 1 );

        System.out.println(num);



        String str2 = "I live Java and I like reading";
        int num2 = str2.lastIndexOf("I");
        System.out.println(num2);


        String cat = "I like cat , i like cat";
        int catnumber = cat.indexOf("c");
        int catnumber2 = cat.lastIndexOf("c");
        System.out.println(catnumber);
        System.out.println(catnumber2);








    }
}
