package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default Constructor");
    }

    public  ConstructorCalls2(int a){
        this();    // "Default constructor"
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String a){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {


        ConstructorCalls2 one = new ConstructorCalls2("Hello");
    }


    public void method1(){

    }
}
