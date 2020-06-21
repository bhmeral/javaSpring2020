package day45_Exceptions;

public class ThrowsKeyword {

    public static void method1() throws Exception{
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws Exception {
        method1();

        System.out.println(Math.log10(100));
    }

}
