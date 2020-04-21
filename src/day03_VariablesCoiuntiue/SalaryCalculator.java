package day03_VariablesCoiuntiue;

public class SalaryCalculator {
    public static void main(String[] args) {

    /*rate = 55;
     stateTax = 0.04;
     federalTax =0.22;
      weeklyHours = 40;
     */

        byte rate=55;
        double stateTaxRate=0.04;
        double federalTax=0.22;
        byte weeklyhours=40;
        double salary= weeklyhours*rate*52;
        double totaltaxrate= 1-(stateTaxRate+federalTax);
        double aftertax= salary-salary*totaltaxrate;

        System.out.println("your salary: " +salary);
        System.out.println("your income after tax: "+ salary*totaltaxrate );
        System.out.println("your total tax: " +(salary-(salary*totaltaxrate)));

        System.out.println("=========================================================-");

        System.out.println("9"+"3"); //  93 concatenation
        System.out.println(9 + 3) ; // 12 addition

        /* number+number====> addition
           number+text=====> concatenation

         */









    }
}
