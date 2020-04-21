package day26_MethodOVerload;

public class MethodOverloading3 {


    public static void main(String[] args) {
        sum(1,4);

        // 10, 15.5
        double num1 = sum(10,15.5);

        // 25l, 30l
        double num2 = sum(25L,30L);


        double num4 = sum(40L,50L);
        System.out.println(num4);

        sum((int)40L,(int)50L);
    }


    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static double sum(double a , double b){
        return a+b ;
    }
}
