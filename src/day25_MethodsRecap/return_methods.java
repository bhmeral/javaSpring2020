package day25_MethodsRecap;

public class return_methods {

    // a,b

    public static int max(int a, int b){
        int max = 0;

        if (a>b){
            max = a;
        }else{
            max = b;
        }
        return max;
    }
    public static int max2(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }





    public static void main(String[] args) {
        int number_max1 =  max(10,13);
        System.out.println(number_max1);
        int number_max2 = max(123,33);
        System.out.println(number_max2);
    }
}
