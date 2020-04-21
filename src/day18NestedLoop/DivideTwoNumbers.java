package day18NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        if(b==0){
            System.out.println("Divisor cannot be zero");
            System.exit(0);
        }


        int count = 0; // count the execution of the loop

        while(a >= b){
            a-=b;
            count++;
        }

        System.out.println(count);


        if( a == 0){
            System.out.println("The result is " + count);
        }else{
            System.out.println("The result is " + count + " with a remainder of " + a );
        }

    }
}
