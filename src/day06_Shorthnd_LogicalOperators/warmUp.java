package day06_Shorthnd_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {



        double  gallons=  10;
        double literingallons= gallons*3.875;

        System.out.println( gallons + " gallon is equal to " +literingallons +" liter.") ;

        System.out.println("=====================================================");


        double liters = 100;
        double galloninliter = liters/3.875;
        System.out.println(liters+ " equals to " +galloninliter + " gallon");

        System.out.println("=====================================================");

        int a = 200; //201,200,199
        int b = -a+++ - --a * a-- % 2;
        //  b = -200 - -200 * 200 % 2
        //  b = -200 - 40000 % 2
        //  b = -200 - 0

        System.out.println(b);
        System.out.println(a);

        System.out.println("=====================================================");


        int x = 300;
        int y = 400;
        int z = x  + y - x * y + x  / y;
        // z = 300 + 400 - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400        300/400 ==> 0.75
        // z = 300 + 400 - 120000 + 0        // reason why its zero compiler takes as int
        // z = 700 - 120000
        System.out.println(z);

        System.out.println("=====================================================");










    }
}
