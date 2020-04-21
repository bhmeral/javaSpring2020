package day22_ArrayLoop;

/*
 write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
                (it's similar to the task 97 in repl.it, But this time you MUST use arrays and for each loop)
 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I like java and javascript";
        int countJava = 0;
        int countPython = 0;
           String words [] = sentence.split(" "); // [I, like, java, and, javascript]

        for ( String each : words){
            if (each.contains("java")){
                countJava++;
            }
            if (each.contains("python")){
                countPython++;
            }
        }
        System.out.println(countJava==countPython);


    }
}
