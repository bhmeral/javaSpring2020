package day09_NestedIf_Turnetry;

public class TernaryPracitice2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int min = (num1<num2) ? num1 : num2 ;
        System.out.println(min);

        System.out.println("==========================================================");



        int hour = 12;
        String timeoftheday = (hour<=12)? "Good Morning" :(hour>12 && hour<18)? "Good Afternoon"
        : "Good Evening";
        System.out.println(timeoftheday);



        System.out.println("==========================================================");

        int number = 30;
        boolean divisibleby15 = (number%5==0 && number%3==0)? true : false;

        System.out.println(divisibleby15);







    }
}
