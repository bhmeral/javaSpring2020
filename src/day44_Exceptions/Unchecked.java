package day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {

      //  System.out.println(9 / 0); ArithmeticException

        String str = "Cybertek";
     //   System.out.println(str.charAt(-1)); OutOfBound Exception ---> Unchecked exception

        int [] arr = {1,2,3};
     //   System.out.println(arr[200]); OutOfBound Exception

        System.out.println("Test completed");
    }
}
