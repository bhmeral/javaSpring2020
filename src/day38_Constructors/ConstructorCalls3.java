package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
       // this(9); // int argument
        System.out.println("Default");
    }

    public ConstructorCalls3(int a){
        this();
        System.out.println("Int Argument");
    }

    public ConstructorCalls3(String str){
        //this("Hello");
    }

    public static void main(String[] args) {

        new ConstructorCalls3();

    }



}
