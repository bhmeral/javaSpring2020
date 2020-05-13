package day38_Constructors;

public class SalaryCalculator {
    /*
    Create class called SalaryCalculator
         instance variables:
            hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
            add a constructor can initialize those fields
          instance methods:
          salary(): returns the total salary as double
          salaryAfterTax(): returns the salary after tax as double
          stateTax(): returns the total state tax as double
          federalTax(): returns the total federal tax as double
          toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
     */
    double hourlyRate;
    int weeklyHours;
    double stateTaxRate;
    double federalTaxRate;

    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){ // annual income
    return hourlyRate * weeklyHours * 48;
    }
    public double stateTax(){ // total tax paid to the state
        return salary() * stateTaxRate;
    }
    public  double federalTax(){ // total tax paid to the federal
        return salary() * federalTaxRate;
    }
    public double salaryAfterTax(){ // salary after tax
        return salary() - stateTax() - federalTax();
    }

    public String toString(){
        return "HourlyRate: " + hourlyRate + "\nWeeklyHour:" + weeklyHours + "\nStateTax: " + stateTax()
                + "\nFederalTax: " + federalTax() + "\nSalaryAfterTax: " + salaryAfterTax() + "\nSalaryBeforeTax:"
                + salary() + "\nTotalTax: " + (salary() - salaryAfterTax());
    }

}
