package OfficeHours.Practice_04_22_2020_Method;

public class return_Method {
    public static void main(String[] args) {

     int result = sum2(31,43);
        System.out.println(result);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int sum2(int a, int b){

        return a+b ;
    }

}
