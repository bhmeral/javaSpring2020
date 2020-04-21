package day02_Variables;

public class VariableExercise {
    public static void main(String[] args) {

    float p3= 3.14f;

    double p =p3;

    int a1 = 3000;
    double d2 = a1;    // 3000.0
        System.out.println(d2);
         long l2 = 40;
         float d3 = l2;

     ////////////////////////////////////////////////////////////////////////////////////////

        /*
        salary,  federal tax , state tax, loan, ssn
         */
            int salary = 120000;
            double federalTax =0.18;
            float stateTax = 0.065f;
            // salary after tax = salary(1-sum of taxes

            double sumTaxes = federalTax + stateTax;
            double salaryAfterTax = salary * (1-sumTaxes);

            System.out.println(salaryAfterTax); // salary after tax

            byte r=10;
            double pi = 3.14;
            double area = r*r*pi;
              System.out.println(area);

              double kg = 60;
              double pound = kg * 2.25;
        System.out.println(pound);

            double pound1 = 120;
            double kg1 = 120/2.25;
        System.out.println(kg1);


        int usd = 1000;
        double usdinlira = 6.65*usd;
        System.out.println(usdinlira);

        double rupi =1000;
        double rupiInDollar = rupi * 0.0014;
        System.out.println(rupiInDollar);


        double liter = 1000;
        double galons = liter /3.7;
        System.out.println(galons);







    }
































}
