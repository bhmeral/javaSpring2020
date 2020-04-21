package day07_IfStatements;
// assume none of them are equal

public class MaxNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c ;
        // if a is greater than both b and c, the a is maximum
        boolean bGreater = b > a && b > c ;
        // if b is greater than both a and c, the b is maximum
        boolean cGreater = c > b && c > a ;
        // if c is greater that bot a and b, the c is maximum


        if(aGreater) {
            System.out.println("The a is maximum");
        }
        if (bGreater) {
            System.out.println("The b is maximum");
        }
        if(cGreater){
            System.out.println("The c is maximum");
        }



    }
}
