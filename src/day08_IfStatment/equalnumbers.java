package day08_IfStatment;

public class equalnumbers {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 20;

        if (n1==n2){
            System.out.println("n1 and n2 are equal.");
        }else{
            System.out.println("n1 and n2 are not equal");
        }

        System.out.println("=====================================");


        double num1 = 30;
        double num2 = 30;
        double num3 = 50;

        if (num1==num2 && num1 != num3){
            System.out.println( num1+" are equal " + num2);

        }

        if (num2==num3 && num2 != num1){
            System.out.println( num2 + " are equal " + num3);

        }

        if (num3==num1 && num3 != num2){
            System.out.println(num3 + " are equal " + num1);

        }

        if (num3==num1 && num3==num2){
            System.out.println( num1 + " is equal to " + num2 + " is equal to " + num3 );
        }else{
            System.out.println("None of them are equal");
        }






































    }

}
