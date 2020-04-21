package day17_WhileLoops;

public class TaskSumOfNumbers {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while( i<=10){
           if(i%2==0){
               sum +=  i;
           }
           i++;
        }
        System.out.println("Sum of even numbers 0 to 10 is: "  + sum);

    }
}
