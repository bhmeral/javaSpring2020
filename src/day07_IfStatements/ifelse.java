package day07_IfStatements;

public class ifelse {
    public static void main(String[] args) {

        int num1= -14;

        boolean evennum1 = num1%2 == 0;
        boolean positivenum1 = num1>= 0;

        if (positivenum1){
            System.out.println(num1 + " is positive number.");
        }
        if (!(positivenum1) ){
            System.out.println(num1 + " is negative number. ");
        }
        System.out.println("================================");
        if (evennum1){
            System.out.println(num1 + " is even number.");
        } else {
            System.out.println(num1 + " is odd number.");
        }
        System.out.println("===================================");
          int age=20;

        if(age>=21){
            System.out.println("Here is your Vodka");
        }else{
            System.out.println("Get out of here.");
        }


        boolean testedPositiveforCorona = true;
        if (testedPositiveforCorona){
            System.out.println("Buy more toilet papers and stay home.");
        }else{
            System.out.println("Do more coding.");
        }


    }
}
