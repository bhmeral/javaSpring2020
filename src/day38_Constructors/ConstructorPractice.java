package day38_Constructors;


public class ConstructorPractice{

    public ConstructorPractice(){
        this(10d);
        System.out.println("A");
    }

    public ConstructorPractice(int a){
        this();
        System.out.println("B");
    }

    public ConstructorPractice(double a){
        // this(); rule #5
        // this(10);
        System.out.println("C");
    }


    public static void main(String[] args) {
       new ConstructorPractice(10);
    }



}
