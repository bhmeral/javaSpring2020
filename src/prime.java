import java.util.Scanner;

public class prime {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = scan.nextInt();

      //  boolean result = isPrime(6);
      //  System.out.println(result);

        for (int i = 1; i <=num; i++){
            if (isPrime(i)){
                System.out.println(i + " is prime");
            }
        }
    }

    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 1 ; i <= n; i++){
            if (n % i == 0){
                count++;
            }
        }

        if (count == 2){
            return true;
        }else{
            return false;
        }
    }

}
