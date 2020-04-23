package OfficeHours.Practice_04_22_2020_Method;

public class Method_Overloading {

    public static void method1(){
        System.out.println("HelloWorld");
    }
    public static int method1(int a){
        System.out.println("HelloBatch18");
        return 10;
    }
    public static void method1(int a, int b){
        System.out.println("HelloCybertek");
    }

    public static void main(String[] args) {

      int num =  method1(22); //"Hello Cybertek", and then returns 10
        System.out.println(num);
    }
}
