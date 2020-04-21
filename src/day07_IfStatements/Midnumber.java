package day07_IfStatements;

public class Midnumber {
    public static void main(String[] args) {

        double a = 1000;
        double b = 200;
        double c = 50;

        /*
        a: if a i <
         */

        if( (a>c && b>a) || (a>b && c>a)){
            System.out.println(a + " is mid number");
        }
        if ((b>a && c>b) || (b>c && a>b)){
            System.out.println(b + " is mid number");
        }
        if ((c>a && b>c) || (c>b && a>c)){
            System.out.println(c + " is mid number");
        }






    }
}
