package day43_MethodOverriding;

class Test{

    public void method(){
        System.out.println("onur");
    }



}








public class  MethodOverriding extends Test{

    public static void main(String[] args) {
        Test obj1 = new Test();
        obj1.method();


        MethodOverriding  obj2 = new MethodOverriding();
        obj2.method();
    }


    public void method(){
        System.out.println("baba");
    }

}
