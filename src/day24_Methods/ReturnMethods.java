package day24_Methods;

public class ReturnMethods {

    public static void maxNum(int a, int b){
        if (a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
     int result  =  addition(100,200);
        System.out.println(result);
    }

    public static int addition(int a,int b){
        return a+b;
        
    }

}
