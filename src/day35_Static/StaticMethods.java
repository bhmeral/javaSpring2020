package day35_Static;

public class StaticMethods {

    int a ;
    static  int b = 200;

    public static void main(String[] args) {

      //  System.out.println(a); static only accepts static

        StaticMethods obj = new StaticMethods();

        System.out.println(obj.a);

        System.out.println(b);
        System.out.println(StaticMethods.b);
        System.out.println(obj.b);

    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }

}
