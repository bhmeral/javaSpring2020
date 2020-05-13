package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();

    }
    public ConstructorCalls(int a){
        this();
    }

    public static void method1(){
       // method2();
    }

    public static void method2(){
        method1();
    }

}
