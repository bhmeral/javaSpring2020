package day26_MethodOVerload;

public class MethodOverloading {
    // parameters must be different data type

    public static void main(String[] args) {
        method(1);
        method(3,4);
    }


    public static void method(int a){
        System.out.println("Original method");
    }
    public static void method(int a, int b){
        System.out.println("Overloaded method");
    }
}










