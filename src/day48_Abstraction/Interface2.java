package day48_Abstraction;

public interface Interface2 {
    // public void method(){}

   // {}

   public static final int a = 100; // public,static,final given by default

    public static void main(String[] args) {
        System.out.println(a); // by default static
      //  a = 200;  by default final
        System.out.println(Interface2.a);
        Interface2.method4();
    }

    static void method4(){}

    void method5();

    default void method6(){
        
    }
}
