package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {
        String str = "Cybertek";

        try {
            System.out.println(str.charAt(100));
        }catch (Exception a){
            System.out.println("Exception: " + a.getMessage());
            System.out.println("Exception: " + a.fillInStackTrace());
        }
        System.out.println("Completed");

        System.out.println("=======================================");
        try {
            System.out.println(100 / 0 );
        }catch (ArithmeticException e){
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Completed");
    }
}
