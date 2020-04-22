package OfficeHours.Practice_04_22_2020_Method;

public class return_Method {
    public static void main(String[] args) {

     int result = sum2(31,43);
        System.out.println(result);

        String result1 = reverse("baha");
        System.out.println(result1);

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static int sum2(int a, int b){

        return a+b ;
    }
    public static String reverse(String str){
        String reuslt = "";
        for(int i = str.length()-1; i>=0; i--){
            reuslt += str.charAt(i);
        }
        return reuslt;
    }
}
