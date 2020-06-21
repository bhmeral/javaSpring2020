package day44_Exceptions;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("Test started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
